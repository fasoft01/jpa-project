package zw.co.afrocodemy.jpaproject.service;

import zw.co.afrocodemy.jpaproject.domain.Student;
import zw.co.afrocodemy.jpaproject.domain.dto.StudentRequest;

import java.util.List;

public interface StudentService {
    public Student createStudent(StudentRequest student);
    public Student updateStudent(Long id, StudentRequest studentRequest);

    Student deleteStudent(Long id);

    Student getById(Long id);

    List<Student> getAll();
}
