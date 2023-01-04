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
    private MemberStatus status;

}
