package com.example.demo.service;

import com.example.demo.dto.StudentDto;

import java.util.List;

public interface StudentService {

    // Add a new student
    StudentDto addStudent(StudentDto studentDto);

    // Retrieve all students
    List<StudentDto> getAllStudents();

    // Retrieve a specific student by ID
    StudentDto getStudentById(Long id);

    // Update a student's information
    StudentDto updateStudent(Long id, StudentDto studentDto);

    // Delete a student record
    void deleteStudent(Long id);

    // Fetch students enrolled in a specific course
    List<StudentDto> getStudentsByCourse(String course);

    // Search students by name using partial match
    List<StudentDto> searchStudentsByName(String name);
}
