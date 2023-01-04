package jojo.solo.song.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column
    private String key;

    @Column
    private String rhythm;

    @Column
    private String content;

    @Column
    private String audioFile;
}
