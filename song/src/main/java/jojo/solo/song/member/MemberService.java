package jojo.solo.song.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
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
}
