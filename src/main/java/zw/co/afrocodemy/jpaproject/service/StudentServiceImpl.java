package zw.co.afrocodemy.jpaproject.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import zw.co.afrocodemy.jpaproject.domain.Student;
import zw.co.afrocodemy.jpaproject.domain.dto.StudentRequest;
import zw.co.afrocodemy.jpaproject.persistance.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService{
private final StudentRepository studentRepository;
    @Override
    public Student createStudent(StudentRequest student) {
        Student newstudent = Student.builder()
                .nameOfStudent(student.getNameOfStudent())
                .age(student.getAge())
                .build();
        studentRepository.save(newstudent);
        return newstudent;
    }

    @Override
    public Student updateStudent(Long id, StudentRequest studentRequest) {
        Optional<Student> student = studentRepository.findById(id);

        if(student.isPresent()){
            student.get().setNameOfStudent(studentRequest.getNameOfStudent());
            student.get().setAge(studentRequest.getAge());
            studentRepository.save(student.get());
            return student.get();
        }
        throw new RuntimeException("Student not found");
    }

    @Override
    public Student deleteStudent(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            studentRepository.delete(student.get());
        }
        return student.get();
    }

    @Override
    public Student getById(Long id) {
        Optional<Student> student = studentRepository.findById(id);
        if(student.isPresent()){
            return student.get();
        }
        throw new RuntimeException("Student Not Found");
    }

    @Override
    public List<Student> getAll() {
        return studentRepository.findAll();
    }
}
