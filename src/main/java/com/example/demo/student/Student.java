package com.example.demo.student;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

//to map class to database use the below annotations
@Entity
@Table
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_seqeunce",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator =  "student_sequence"
    )
    //declare the fields
    private Long id;
    private String name;
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;

    //Create constructors
    public Student() {
    }

    public Student(Long id, String name, String email, LocalDate dob) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    public Student(String name, String email, LocalDate dob) {
        this.name = name;
        this.email = email;
        this.dob = dob;
    }

    //Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getAge() {
        return Period.between(this.dob,
                LocalDate.now()).getYears();
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //toString
    @Override
    public String toString() {

        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", age=" + age +
                '}';

    }

}
