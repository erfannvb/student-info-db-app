package nvb.springframework.studentinfodbapp.controller;

import lombok.AllArgsConstructor;
import nvb.springframework.studentinfodbapp.model.Student;
import nvb.springframework.studentinfodbapp.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    public List<Student> getStudents() {
        return studentService.getStudents();
    }

    @PostMapping
    public void registerNewStudent(@RequestBody Student student) {
        studentService.addNewStudent(student);
    }

}
