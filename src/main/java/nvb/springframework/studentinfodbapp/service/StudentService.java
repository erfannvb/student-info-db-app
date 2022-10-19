package nvb.springframework.studentinfodbapp.service;

import lombok.AllArgsConstructor;
import nvb.springframework.studentinfodbapp.model.Student;
import nvb.springframework.studentinfodbapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

}
