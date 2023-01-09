package jojo.solo.song.comment;

import jojo.solo.song.project.Project;
import jojo.solo.song.project.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class CommentService {
    private final CommentRepository commentRepository;
    private final CommentMapper commentMapper;
    private final ProjectRepository projectRepository;

    public CommentDto.Response save(Long projectId, CommentDto.Post post){
        // todo: 작성자 정보 받아와서 매퍼에 넣어주기
        Optional<Project> project = projectRepository.findById(projectId);
        if (project.isPresent()){
            Comment comment = commentMapper.postToComment(post, project.get());
            commentRepository.save(comment);
            return  commentMapper.commentToResponse(comment, projectId);
        } else {
            throw new ResponseStatusException(404, "NOT_FOUND_PROJECT", new IllegalArgumentException());
        }
    }
}
