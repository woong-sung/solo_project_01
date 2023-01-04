package jojo.solo.song.project;

import org.mapstruct.Mapper;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface ProjectMapper {
    default Project projectDtoToProject(ProjectDto.Post post){
        return Project.builder()
                .imgUrl(post.getImgUrl())
                .title(post.getTitle())
                .genre(post.getGenre())
                .workSession(post.getWorkSession())
                .necessarySession(post.getNecessarySession())
                .lyrics(post.getLyrics())
                .referenceUrl(post.getReferenceUrl())
                .bpm(post.getBpm())
                .key(post.getKey())
                .rhythm(post.getRhythm())
                .content(post.getContent())
                .audioFile(post.getAudioFile())
                .createdAt(LocalDateTime.now())
                // todo: 좋아요, 팔로우 생성 필요
                // todo: 댓글, 작성자 연관관계 설정 필요
                // todo: projectMusic 연관관계 설정 필요
                .build();
    }

    default ProjectDto.Response projectToProjectResponse(Project project){
        return ProjectDto.Response.builder()
                .imgUrl(project.getImgUrl())
                .title(project.getTitle())
                .genre(project.getGenre())
                .workSession(project.getWorkSession())
                .necessarySession(project.getNecessarySession())
                .lyrics(project.getLyrics())
                .referenceUrl(project.getReferenceUrl())
                .bpm(project.getBpm())
                .key(project.getKey())
                .rhythm(project.getRhythm())
                .content(project.getContent())
                .audioFile(project.getAudioFile())
                .createdAt(project.getCreatedAt())
                .build();
    }

}
