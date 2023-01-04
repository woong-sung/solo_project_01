package jojo.solo.song.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum MemberStatus {
    REGISTERED(0, "등록", "사용자 등록상태"),
    DORMANT(1, "휴면", "사용자 휴면상태"),
    WITHDRAWAL(2, "탈퇴", "사용자 탈퇴상태");

    private final Integer id;
    private final String title;
    private final String description;

    MemberStatus(int id, String title, String description) {
        this.id = id;
        this.title = title;
        this.description = description;
    }

}
