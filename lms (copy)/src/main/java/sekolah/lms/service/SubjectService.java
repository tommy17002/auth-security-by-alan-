package sekolah.lms.service;

import sekolah.lms.model.Subject;

import java.util.List;

public interface SubjectService {

    Subject create(Subject req);

    List<Subject> getAll();

    Subject getOne(Integer id);

    Subject update(Integer id, Subject req);

    void delete(Integer id);
}
