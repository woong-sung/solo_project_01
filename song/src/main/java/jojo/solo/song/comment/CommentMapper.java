package jojo.solo.song.comment;

import org.mapstruct.Mapper;

import java.time.LocalDateTime;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    default Comment postToComment(CommentDto.Post post) {
        return Comment.builder()
                .content(post.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }
    default CommentDto.Response commentToResponse(Comment comment) {
        return CommentDto.Response.builder()
                .content(comment.getContent())
                .createdAt(LocalDateTime.now())
                .build();
    }
}
