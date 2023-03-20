package com.example.demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository extends JpaRepository
        <Student,Long>
{
    //this method will be transformed to a sql query
    //@Query("SELECT s FROM Student WHERE s.email = ?1")
    Optional<Student> findStudentByEmail(String email);

}
