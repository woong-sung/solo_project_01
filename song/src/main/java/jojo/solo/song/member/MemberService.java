package jojo.solo.song.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.time.LocalDateTime;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final MemberMapper memberMapper;

    public MemberDto.Response save(MemberDto.SignIn signIn){
        Member member = Member.builder()
                .id(signIn.getId())
                .nickname(signIn.getNickname())
                .password(signIn.getPassword())
                // todo: 프로필 기본이미지 설정
                .profileUrl("기본이미지 url")
                .mainInst("none")
                .status(MemberStatus.REGISTERED)
                .createdAt(LocalDateTime.now())
                .build();
        memberRepository.save(member);

        return memberMapper.memberToMemberResponse(member);
    }

    public Member findById(long memberId) {
        Optional<Member> optionalMember = memberRepository.findById(memberId);
        if (optionalMember.isPresent()){
            if (optionalMember.get().getStatus() == MemberStatus.WITHDRAWAL){
                throw new ResponseStatusException(404, "NOT_FOUND_MEMBER", new IllegalArgumentException());
            }
            return optionalMember.get();
        }else {
            throw new ResponseStatusException(404, "NOT_FOUND_MEMBER", new IllegalArgumentException());
        }
    }

    public void withdraw(long memberId){
        Member member = findById(memberId);
        member.changeStatus(MemberStatus.WITHDRAWAL);
    }
}
