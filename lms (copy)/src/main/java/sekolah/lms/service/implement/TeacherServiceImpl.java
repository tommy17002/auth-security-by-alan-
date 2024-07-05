package sekolah.lms.service.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sekolah.lms.model.Teacher;
import sekolah.lms.repository.TeacherRepository;
import sekolah.lms.service.TeacherService;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeacherServiceImpl implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Override
    public Teacher create(Teacher req) {
        return teacherRepository.save(req);
    }

    @Override
    public List<Teacher> getAll() {
        return teacherRepository.findAll();
    }

    @Override
    public Teacher getOne(Integer id) {
        return teacherRepository.findById(id).orElse(null);
    }

    @Override
    public Teacher update(Integer id, Teacher req) {
        Teacher student = this.getOne(id);
        student.setName(req.getName());
        student.setBirthDate(req.getBirthDate());

        return teacherRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        teacherRepository.deleteById(id);
    }

}
