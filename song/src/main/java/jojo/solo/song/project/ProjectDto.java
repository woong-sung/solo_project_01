package jojo.solo.song.project;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class ProjectDto {
    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class Post{
        private String title;
        private String genre;
        private String workSession;
        private String necessarySession;
        private String lyrics;
        private String referenceUrl;
        private int bpm;
        private String pitch;
        private String rhythm;
        private String content;
    }

    @Getter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
    static class Response{
        private String imgUrl;
        private String title;
        private String genre;
        private String workSession;
        private String necessarySession;
        private String lyrics;
        private String referenceUrl;
        private int bpm;
        private String pitch;
        private String rhythm;
        private String content;
        private String audioFile;
        private LocalDateTime createdAt;
        // todo: 좋아요, 팔로우 생성 필요
        // todo: 댓글, 작성자 연관관계 설정 필요
        // todo: projectMusic 연관관계 설정 필요
    }
}
