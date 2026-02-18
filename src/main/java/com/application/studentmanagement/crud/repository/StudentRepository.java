package com.application.studentmanagement.crud.repository;

import com.application.studentmanagement.crud.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> id(Long id);
}
