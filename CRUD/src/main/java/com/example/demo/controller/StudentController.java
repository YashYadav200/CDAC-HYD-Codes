package com.example.demo.controller;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping
    public ResponseEntity<StudentDto> addStudent(@RequestBody StudentDto studentDto) {
        // TODO: Implement add student endpoint
        return null;
    }

    @GetMapping
    public ResponseEntity<List<StudentDto>> getAllStudents() {
        // TODO: Implement get all students endpoint
        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<StudentDto> getStudentById(@PathVariable Long id) {
        // TODO: Implement get student by ID endpoint
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<StudentDto> updateStudent(@PathVariable Long id, @RequestBody StudentDto studentDto) {
        // TODO: Implement update student endpoint
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteStudent(@PathVariable Long id) {
        // TODO: Implement delete student endpoint
        return null;
    }

    @GetMapping("/course/{course}")
    public ResponseEntity<List<StudentDto>> getStudentsByCourse(@PathVariable String course) {
        // TODO: Implement get students by course endpoint
        return null;
    }

    @GetMapping("/search")
    public ResponseEntity<List<StudentDto>> searchStudentsByName(@RequestParam String name) {
        // TODO: Implement search students by name endpoint
        return null;
    }
}
