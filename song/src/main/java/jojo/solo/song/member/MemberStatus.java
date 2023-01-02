package jojo.solo.song.member;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum MemberStatus {
    REGISTERED(0, "등록", "사용자 등록상태"),
    DORMANT(1, "휴면", "사용자 휴면상태"),
    WITHDRAWAL(2, "탈퇴", "사용자 탈퇴상태");

    private Integer id;
    private String title;
    private String description;

}
