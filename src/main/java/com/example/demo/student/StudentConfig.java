package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student hps = new Student(
                    "hps",
                    "hps@gmail.com",
                    LocalDate.now(),
                    20
            );
            Student santiago = new Student(
                    "heldersantiago",
                    "heldersantiago@gmail.com",
                    LocalDate.now(),
                    20
            );
            studentRepository.saveAll(List.of(hps, santiago));
        };
    }
}
