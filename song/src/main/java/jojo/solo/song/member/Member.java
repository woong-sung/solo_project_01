package jojo.solo.song.member;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String nickname;

    @Column
    private String password;

    @Column
    private String profileUrl;

    @Column
    private String mainInst;

    @Column
    private LocalDateTime createdAt;

    @Column
    private LocalDateTime lastLogin;

    @Column
    private MemberStatus status;

    public void changeStatus(MemberStatus memberStatus){
        this.status = memberStatus;
    }

    public void changeLoginTime(LocalDateTime localDateTime){
        this.lastLogin = localDateTime;
    }
}
