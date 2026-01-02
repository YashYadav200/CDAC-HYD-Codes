package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {

    private Long id;
    private String name;
    private String email;
    private String course;
    private LocalDate enrollmentDate;

    // Additional fields or methods can be added here as needed
}
