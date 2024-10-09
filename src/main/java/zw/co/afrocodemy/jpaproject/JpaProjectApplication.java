package zw.co.afrocodemy.jpaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zw.co.afrocodemy.jpaproject.service.StudentService;
import zw.co.afrocodemy.jpaproject.service.StudentServiceImpl;

@SpringBootApplication
public class JpaProjectApplication {
    public static void main(String[] args) {
        SpringApplication.run(JpaProjectApplication.class, args);
    }
}
