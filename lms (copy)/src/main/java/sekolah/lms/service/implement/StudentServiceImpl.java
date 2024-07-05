package sekolah.lms.service.implement;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import sekolah.lms.model.Student;
import sekolah.lms.repository.StudentRepository;
import sekolah.lms.service.StudentService;
import sekolah.lms.utils.Specification.StudentSpecification;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentRepository studentRepository;

    @Override
    public Student create(Student req) {
        String prefixNim = req.getName() + req.getBirthDate().getTime();
        req.setNim(prefixNim);
        return studentRepository.save(req);
    }

    @Override
    public Page<Student> getAll(Pageable pageable, String name) {
        Specification<Student> spec = StudentSpecification.getSpecification(name);
        return studentRepository.findAll(spec, pageable);
    }

    @Override
    public Student getOne(Integer id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("STUDENT WITH ID " + id + " IS NOT FOUND!"));
    }

    @Override
    public Student update(Integer id, Student req) {
        Student student = this.getOne(id);
        student.setName(req.getName());
        student.setNim(req.getNim());
        student.setBirthDate(req.getBirthDate());
        student.setUsername(req.getUsername());
        student.setPassword(req.getPassword());

        return studentRepository.save(student);
    }

    @Override
    public void delete(Integer id) {
        studentRepository.deleteById(id);
    }
}
