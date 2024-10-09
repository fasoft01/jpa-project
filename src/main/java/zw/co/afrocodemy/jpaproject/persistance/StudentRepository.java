package zw.co.afrocodemy.jpaproject.persistance;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import zw.co.afrocodemy.jpaproject.domain.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {
}
