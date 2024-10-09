package zw.co.afrocodemy.jpaproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zw.co.afrocodemy.jpaproject.domain.Student;
import zw.co.afrocodemy.jpaproject.persistance.StudentRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
private final StudentRepository studentRepository;
    @Override
    public Student createStudent() {
        Student student = new Student();
        student.setNameOfStudent("Farai Matsika");
        student.setAge(30L);

        studentRepository.save(student);
        return student;
    }

    @Override
    public Student updateStudent(Long id, String newName) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            student.get().setNameOfStudent(newName);
            studentRepository.save(student.get());
        }
        return student.get();
    }
}
