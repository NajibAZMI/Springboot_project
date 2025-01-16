package com.example.demo.student;

import java.time.LocalDate;

public class Student {
private Long id;
private String name;
private String email;
private LocalDate dob;
private Integer age;

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
}
