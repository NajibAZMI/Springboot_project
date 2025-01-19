package com.example.demo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private  final  StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudents() {
        return studentRepository.findAll();
    }

    public void addNeWStudent(Student s) {
        Optional<Student> studentByEmail=studentRepository.findStudentByEmail(s.getEmail());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("Email already in use");
        } System.out.println("Student "+s);
        studentRepository.save(s);
    }

    public void deleteStudent(Long id) {
        Student s=studentRepository.findAllById(id);
    }
}
