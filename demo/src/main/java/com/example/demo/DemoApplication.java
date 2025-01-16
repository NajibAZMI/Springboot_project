package com.example.demo;
import com.example.demo.student.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	@GetMapping
	public List<Student> helloWorld() {
		return List.of(new Student(1,"NAJIB AZMI","najib@gmail.com", LocalDate.of(2004,01,20),21),
				new Student(2,"HAMZA BERCHIL","hamza@gmail.com", LocalDate.of(2002,05,20),23)
				);
	}
	@GetMapping("/test")
	public String test() {
		return "Test!";
	}
}
