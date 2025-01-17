package com.example.demo.student;

import jakarta.persistence.*;

import java.time.LocalDate;
@Entity
@Table
public class Student {
    @Id
    @SequenceGenerator(
            name="student_sequence",
            sequenceName = "student_sequence",
            allocationSize=1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    private Integer age;

    public Student(Long id,String name, String email, LocalDate dob , Integer age){
        this.id=id;
        this.age=age;
        this.dob=dob;
        this.email=email;
        this.name=name;
    }
    //Getters
    public Integer getAge() {
        return age;
    }
    public LocalDate getDob() {
        return dob;
    }
    public String getEmail() {
        return email;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    //Setters


    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setId( Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Id : "+getId()+" Name : "+getName()+" Age : "+getAge()+" Date : "+getDob();
    }
}
