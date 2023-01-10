package jojo.solo.song.project;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import javax.transaction.Transactional;
import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProjectService {
    private final ProjectMapper projectMapper;
    private final ProjectRepository projectRepository;

    public ProjectDto.Response save(ProjectDto.Post postDto) {
        //todo: 이미지 입력받아서 매퍼에 넣어주는 작업 필요
        //todo: 오디오파일 입력받아서 매퍼에 넣어주는 작업 필요
        //todo: 작성자 연결 필요
        Project project = projectMapper.projectDtoToProject(postDto);
        projectRepository.save(project);

        return projectMapper.projectToProjectResponse(project);
    }

    public Project findById(long projectId) {
        Optional<Project> optionalProject = projectRepository.findById(projectId);
        if (optionalProject.isPresent()){
            return optionalProject.get();
        }else {
            throw new ResponseStatusException(404, "NOT_FOUND_PROJECT", new IllegalArgumentException());
        }
    }

    public void delete(long projectId) {
        projectRepository.deleteById(projectId);
    }

}
