package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class   StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student cebo = new
                    Student("Cebo",
                    "mongi@gmail.com",
                    LocalDate.of(2002, Month.JANUARY,29));

            Student makhi = new Student("Makhi",
                    "viwe@gmail.com",
                    LocalDate.of(1995, Month.JULY,10));
            repository.saveAll(
                    List.of(cebo, makhi));
        };
    }
}
