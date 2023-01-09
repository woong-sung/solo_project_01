package jojo.solo.song.comment;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;

    public CommentDto.Response save(CommentDto.Post post){
        Comment comment = commentMapper.postToComment(post);
        commentRepository.save(comment);
        return  commentMapper.commentToResponse(comment);
    }
}
