package jojo.solo.song.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

public class MemberDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class SignIn {
        private String id;
        private String nickname;
        private String password;
    }
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Response {
        private long memberId;
        private String id;
        private String nickname;
        private String profileUrl;
        private String mainInst;
        private LocalDateTime createdAt;
        private MemberStatus status;
    }
}
