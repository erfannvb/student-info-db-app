package nvb.springframework.studentinfodbapp;

import nvb.springframework.studentinfodbapp.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@SpringBootApplication
public class StudentInfoDbAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentInfoDbAppApplication.class, args);
    }

}
