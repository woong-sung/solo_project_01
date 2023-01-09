package jojo.solo.song.comment;

import jojo.solo.song.project.Project;
import org.mapstruct.Mapper;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    default Comment postToComment(CommentDto.Post post, Project project) {
        return Comment.builder()
                .project(project)
                .content(post.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }
    default CommentDto.Response commentToResponse(Comment comment, long projectId) {
        return CommentDto.Response.builder()
                .projectId(projectId)
                .content(comment.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
