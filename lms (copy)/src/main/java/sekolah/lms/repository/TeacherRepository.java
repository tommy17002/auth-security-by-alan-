package sekolah.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sekolah.lms.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
}
