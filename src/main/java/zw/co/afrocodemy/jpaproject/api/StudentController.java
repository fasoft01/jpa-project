package zw.co.afrocodemy.jpaproject.api;

import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import zw.co.afrocodemy.jpaproject.domain.Student;
import zw.co.afrocodemy.jpaproject.service.StudentService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    @PostMapping
    @Operation(description = "Create Student")
    public ResponseEntity<Student> saveStudent(){
        return ResponseEntity.ok(studentService.createStudent());
    }

    @PutMapping("{id}")
    @Operation(description = "Update Student")
    public ResponseEntity<Student> updateStudent(@PathVariable Long id,
                                                 @RequestParam String newName){
        return ResponseEntity.ok(studentService.updateStudent(id,newName));
    }

}
