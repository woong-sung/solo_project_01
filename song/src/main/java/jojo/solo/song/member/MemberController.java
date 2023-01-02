package jojo.solo.song.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {
    private final MemberService memberService;
    private final MemberMapper memberMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MemberDto.Response signIn(@RequestBody MemberDto.SignIn signIn) {
        Member member = memberService.save(signIn);

        return memberMapper.memberToMemberResponse(member);
    }
}
