package sekolah.lms.service;

import sekolah.lms.model.Subject;
import sekolah.lms.model.Teacher;

import java.util.List;

public interface TeacherService {

    Teacher create(Teacher req);

    List<Teacher> getAll();

    Teacher getOne(Integer id);

    Teacher update(Integer id, Teacher req);

    void delete(Integer id);

}
