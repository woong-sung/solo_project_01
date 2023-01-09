package jojo.solo.song.comment;

import jojo.solo.song.project.ProjectDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comments")
@RequiredArgsConstructor
public class CommentController {
    private final CommentService commentService;

    @PostMapping("/{project-id}")
    @ResponseStatus(HttpStatus.CREATED)
    public CommentDto.Response post(@PathVariable("project-id") Long projectId,
                                    @RequestBody CommentDto.Post postDto) {
        return commentService.save(projectId, postDto);
    }
}
