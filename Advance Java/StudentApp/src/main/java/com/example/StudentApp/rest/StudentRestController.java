package com.example.StudentApp.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;

import jakarta.annotation.PostConstruct;

@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> students;

    // load data only once
    @PostConstruct
    public void loadStudentData() {
        students = new ArrayList<>();
        students.add(new Student(1, "Yash", 9.9));
        students.add(new Student(4, "Vipul", 9.9));
        students.add(new Student(2, "Raj", 9.9));
        students.add(new Student(6, "Roy", 9.9));
        students.add(new Student(8, "Demon", 9.9));
    }

    // GET → all students
    @GetMapping("/student")
    public List<Student> getAllStudents() {
        return students;
    }

    // GET → single student by ID
    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {

        // search student by id
        for (Student s : students) {
            if (s.getSid() == id) {
                return s;
            }
        }

        // if not found throw error
        throw new RuntimeException("Student ID not found: " + id);
    }

    // POST → create new student
    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student) {
        students.add(student);
        return student;
    }
}
