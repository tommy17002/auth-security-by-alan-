package sekolah.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sekolah.lms.model.SubjectStudent;

@Repository
public interface SubjectStudentRepository extends JpaRepository<SubjectStudent, Integer> {
}
