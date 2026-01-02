package com.example.demo.service.impl;

import com.example.demo.dto.StudentDto;
import com.example.demo.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    // TODO: Inject repository here
    // private final StudentRepository studentRepository;

    @Override
    public StudentDto addStudent(StudentDto studentDto) {
        // TODO: Implement add student logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<StudentDto> getAllStudents() {
        // TODO: Implement get all students logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public StudentDto getStudentById(Long id) {
        // TODO: Implement get student by ID logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public StudentDto updateStudent(Long id, StudentDto studentDto) {
        // TODO: Implement update student logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public void deleteStudent(Long id) {
        // TODO: Implement delete student logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<StudentDto> getStudentsByCourse(String course) {
        // TODO: Implement get students by course logic
        throw new UnsupportedOperationException("Not implemented yet");
    }

    @Override
    public List<StudentDto> searchStudentsByName(String name) {
        // TODO: Implement search students by name logic
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
