package nvb.springframework.studentinfodbapp.service;

import lombok.AllArgsConstructor;
import nvb.springframework.studentinfodbapp.model.Student;
import nvb.springframework.studentinfodbapp.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository studentRepository;

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNewStudent(Student student) {
        Optional<Student> studentOptional = studentRepository.findStudentByName(student.getName());
        if (studentOptional.isPresent()) {
            throw new IllegalStateException("Email is taken.");
        }
        studentRepository.save(student);
    }
}
