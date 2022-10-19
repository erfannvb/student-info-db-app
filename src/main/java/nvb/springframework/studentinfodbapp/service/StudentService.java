package nvb.springframework.studentinfodbapp.service;

import nvb.springframework.studentinfodbapp.model.Student;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1L,
                        "David",
                        "david@yahoo.com",
                        LocalDate.of(2000, Month.SEPTEMBER, 20),
                        22)
        );
    }

}
