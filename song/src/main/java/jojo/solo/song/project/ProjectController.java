package jojo.solo.song.project;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/projects")
@RequiredArgsConstructor
public class ProjectController {
    private final ProjectService projectService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ProjectDto.Response post(@RequestBody ProjectDto.Post postDto) {
        return projectService.save(postDto);
    }

    @DeleteMapping("/{project-id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable("project-id") long projectId) {
        projectService.delete(projectId);
    }
}
