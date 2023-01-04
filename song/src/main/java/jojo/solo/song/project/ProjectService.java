package jojo.solo.song.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectMapper projectMapper;
    private final ProjectRepository projectRepository;

    public ProjectDto.Response save(ProjectDto.Post postDto) {
        Project project = projectMapper.projectDtoToProject(postDto);
        projectRepository.save(project);

        return projectMapper.projectToProjectResponse(project);
    }
}
