package jojo.solo.song.project;

import jojo.solo.song.comment.Comment;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long projectId;

    @Column
    private String imgUrl;

    @Column
    private String title;

    @Column
    private String genre;

    @Column
    private String workSession;

    @Column
    private String necessarySession;

    @Column
    private String lyrics;

    @Column
    private String referenceUrl;

    @Column
    private int bpm;

    // key가 예약어라 못쓴다.
    @Column
    private String pitch;

    @Column
    private String rhythm;

    @Column
    private String content;

    @Column
    private String audioFile;

    @Column
    private LocalDateTime createdAt;

    @OneToMany(mappedBy = "project", cascade = CascadeType.REMOVE)
    private List<Comment> comments = new ArrayList<>();

    // todo: 좋아요, 팔로우 생성 필요
    // todo: 작성자 연관관계 설정 필요
    // todo: projectMusic 연관관계 설정 필요
}
