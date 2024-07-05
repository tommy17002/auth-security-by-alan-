package sekolah.lms.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import sekolah.lms.model.Student;

import java.util.List;

public interface StudentService {

    Student create(Student req);

    Page<Student> getAll(Pageable pageable, String name);

    Student getOne(Integer id);

    Student update(Integer id, Student req);

    void delete(Integer id);
}
