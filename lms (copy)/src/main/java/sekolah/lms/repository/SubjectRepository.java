package sekolah.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sekolah.lms.model.Subject;

@Repository
public interface SubjectRepository extends JpaRepository<Subject, Integer> {
}
