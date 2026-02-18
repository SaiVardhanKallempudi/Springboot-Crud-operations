package com.application.studentmanagement.crud.service;

import com.application.studentmanagement.crud.entity.Student;
import com.application.studentmanagement.crud.repository.StudentRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
class StudentServicesTest {

    @Mock
    StudentRepository studentRepository;
    @InjectMocks
    StudentServices studentServices;
    @Test
    void addStudent() {
        Student student = new Student();
        student.setId(1L);
        student.setName("sai");
        student.setEmail("sai@gmail.com");
        student.setGender("male");
        student.setRollNo(01);
        student.setAddress("Vizag");
        when(studentRepository.save(student)).thenReturn(student);
        Student addedStudent = studentServices.addStudent(student);
        Assertions.assertNotNull(addedStudent);
        Assertions.assertEquals(addedStudent.getId(), addedStudent.getId());

    }
}