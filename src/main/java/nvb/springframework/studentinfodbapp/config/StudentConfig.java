package nvb.springframework.studentinfodbapp.config;

import nvb.springframework.studentinfodbapp.model.Student;
import nvb.springframework.studentinfodbapp.repository.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student david = new Student("David", "david.doe@yahoo.com",
                    LocalDate.of(1992, Month.MARCH, 15));

            Student jessica = new Student("Jessica", "jess1998@gmail.com",
                    LocalDate.of(1996, Month.FEBRUARY, 21));

            studentRepository.saveAll(List.of(david, jessica));
        };
    }

}
