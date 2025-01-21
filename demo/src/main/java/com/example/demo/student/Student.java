package com.example.demo.student;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;
import java.time.Period;

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
    @Size(min = 5, max = 20, message = "Le prénom doit avoir entre 5 et 20 caractères")
    @NotNull(message = "Le nom est obligatoire")
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;
    public Student() {
    }
    public Student(Long id,String name, String email, LocalDate dob ){
        this.id=id;
        this.dob=dob;
        this.email=email;
        this.name=name;
    }
    //Getters
    public Integer getAge() {
        return Period.between(dob,LocalDate.now()).getYears();
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
