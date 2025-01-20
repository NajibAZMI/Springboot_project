package com.example.demo.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.demo.student.StudentService;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
@RestController
@RequestMapping(path = "api/v1/Student")
public class StudentController {
    private final StudentService studentService;
    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/az")
    public List<Student> getStudents() {
           return studentService.getStudents();
    }
    @PostMapping
    public void EnrgStudent(@RequestBody Student s){
       studentService.addNeWStudent(s);
    }
    @DeleteMapping(path="/{id}")
    public void SuppStudent(@PathVariable("id")  Long id){
        studentService.deleteStudent(id);
    }
    @PutMapping(path="/{id}")
    public void updateStudent(@PathVariable("id")Long id,@RequestParam(required = false) String name,@RequestParam(required = false) String email){
        System.out.println("rah chi put hnaya awlidi");
        studentService.updateStudent(id,name,email);
    }
}
