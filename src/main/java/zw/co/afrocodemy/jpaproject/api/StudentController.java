package zw.co.afrocodemy.jpaproject.api;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrocodemy.jpaproject.domain.Student;
import zw.co.afrocodemy.jpaproject.domain.dto.StudentRequest;
import zw.co.afrocodemy.jpaproject.service.StudentService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @Operation(description = "Create Student")
    public ResponseEntity<Student> saveStudent(
            @RequestBody StudentRequest student
    ){
        return ResponseEntity.ok(studentService.createStudent(student));
    }

    @PutMapping("{id}")
    @Operation(description = "Update Student")
    public ResponseEntity<Student> updateStudent(
            @PathVariable Long id,
            @RequestBody StudentRequest studentRequest){
        return ResponseEntity.ok(studentService.updateStudent(id,studentRequest));
    }

    @GetMapping("{id}")
    @Operation(description = "Get Student by Id")
    public ResponseEntity<Student> getById(
            @PathVariable Long id){
        return ResponseEntity.ok(studentService.getById(id));
    }

    @DeleteMapping("{id}")
    @Operation(description = "Deletes Student")
    public ResponseEntity<Student> deleteStudent(
            @PathVariable Long id){
        return ResponseEntity.ok(studentService.deleteStudent(id));
    }

    @GetMapping
    @Operation(description = "Gets All Students")
    public ResponseEntity<List<Student>> getAll(){
        return ResponseEntity.ok(studentService.getAll());
    }
}
