package com.example.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {
    @GetMapping("/az")
    public List<Student> getStudents() {
        return List.of(new Student(1,"NAJIB AZMI","najib@gmail.com", LocalDate.of(2004, Month.JANUARY,20),21),
                new Student(2,"HAMZA BERCHIL","hamza@gmail.com", LocalDate.of(2002,Month.JANUARY,10),23)
        );
    }
}
