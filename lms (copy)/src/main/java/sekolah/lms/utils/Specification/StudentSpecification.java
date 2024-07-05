package sekolah.lms.utils.Specification;

import jakarta.persistence.criteria.Predicate;
import org.springframework.data.jpa.domain.Specification;
import sekolah.lms.model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentSpecification {
    public static Specification<Student> getSpecification(String name) {
        List<Predicate> predicates = new ArrayList<>();

        return (root, query, criteriaBuilder) -> {
            if (name != null && !name.isEmpty()) {
                predicates.add(criteriaBuilder.like(root.get("name"), "%" + name + "%"));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };

    }
}
