package jojo.solo.song.member;

import lombok.Builder;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberId;

    @Column(nullable = false)
    private String id;

    @Column(nullable = false)
    private String nickName;

    @Column
    private String password;

    @Column
    private String profileUrl;

    @Column
    private String mainInst;

    @Column
    private LocalDateTime createdAt;

}
