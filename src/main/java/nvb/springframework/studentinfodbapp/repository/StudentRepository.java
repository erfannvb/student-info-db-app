package nvb.springframework.studentinfodbapp.repository;

import nvb.springframework.studentinfodbapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
