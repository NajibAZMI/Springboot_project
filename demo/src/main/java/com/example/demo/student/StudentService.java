package com.example.demo.student;

import jakarta.transaction.Transactional;
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
       boolean ex=studentRepository.existsById(Math.toIntExact(id));
       if(!ex){
           throw new IllegalStateException("Student with ID("+id+") n existe pas");
       }else {
           studentRepository.deleteById(Math.toIntExact(id));
       }
    }
    @Transactional
    public void updateStudent(Long id, String name, String email) {
        Student student=studentRepository.findById(id);
             if(name != null){
                 student.setName(name);
             }
             if(email !=null){
                 student.setEmail(email);
             }
    }
}
