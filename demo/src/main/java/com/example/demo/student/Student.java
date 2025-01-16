package com.example.demo.student;

import java.time.LocalDate;

public class Student {
private int id;
private String name;
private String email;
private LocalDate dob;
private Integer age;

    public Student(int id,String name, String email, LocalDate dob , Integer age){
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
    public int getId() {
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

    public void setId(int id) {
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
