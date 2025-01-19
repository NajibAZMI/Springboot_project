package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
      @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
          return args->{
              Student najib=new Student(null,"NAJIB AZMI","najib@gmail.com", LocalDate.of(2004,1,20));
              Student hamza=new Student(null,"hamza Berchil","hamza@gmail.com", LocalDate.of(2002,1,20));
              studentRepository.saveAll(List.of(najib,hamza));
          };

      }
}
