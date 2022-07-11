package com.github.yildizmy.dto.response;

import com.github.yildizmy.model.Employee;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;

@Data
@AllArgsConstructor
public class EmployeeDto {
    private Long id;
    private String name;
    private String email;
    private String country;
    private LocalDate birthDate;

    public EmployeeDto(Employee employee) {
        this.id = employee.getId();
        this.name = employee.getName();
        this.email = employee.getEmail();
        this.country = employee.getCountry();
        this.birthDate = employee.getBirthDate();
    }
}
