package jojo.solo.song.member;

import lombok.Builder;
import lombok.Getter;

public class MemberDto {
    @Getter
    @Builder
    class SignIn {
        private String id;
        private String nickname;
        private String password;
    }
}
