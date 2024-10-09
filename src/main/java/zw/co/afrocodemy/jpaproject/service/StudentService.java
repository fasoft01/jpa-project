package zw.co.afrocodemy.jpaproject.service;

import zw.co.afrocodemy.jpaproject.domain.Student;

public interface StudentService {
    public Student createStudent();
    public Student updateStudent(Long id,String newName);
}
