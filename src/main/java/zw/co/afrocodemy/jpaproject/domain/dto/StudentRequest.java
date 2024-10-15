package zw.co.afrocodemy.jpaproject.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentRequest {
    private String nameOfStudent;
    private Long age;
}
