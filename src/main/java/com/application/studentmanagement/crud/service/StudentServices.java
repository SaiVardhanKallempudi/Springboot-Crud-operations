package com.application.studentmanagement.crud.service;

import com.application.studentmanagement.crud.controller.StudentController;
import com.application.studentmanagement.crud.entity.Student;
import com.application.studentmanagement.crud.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class StudentServices {

    @Autowired
    private StudentRepository studentRepository;
    public Student addStudent(Student student) {
        log.info("Adding student " + student);
        List<String> missingFields = new ArrayList<>();

        if (student.getName() == null || student.getName().trim().isEmpty()) {
            missingFields.add("name");
        }
        if (student.getEmail() == null || student.getEmail().trim().isEmpty()) {
            missingFields.add("email");
        }
        if (student.getGender() == null || student.getGender().trim().isEmpty()) {
            missingFields.add("gender");
        }
        if (student.getRollNo() == null) {
            missingFields.add("rollNo");
        }
        if (student.getAddress() == null || student.getAddress().trim().isEmpty()) {
            missingFields.add("address");
        }

        if (!missingFields.isEmpty()) {
            throw new InvalidStudentDetails("Missing fields: " + String.join(", ", missingFields));
        }
        Student students = studentRepository.save(student);
        return students;
    }
    public Student getDetails(Long id){
        Student Details = studentRepository.findById(id)
        .orElseThrow( () -> new StudentController.StudentDetailsNotFound("Student details not found for id - " + id));
        log.info("details not found");
        return Details;
    }

    public Student updateDetails(Student student) {
        Student updatedDetails = studentRepository.save(student);
        return updatedDetails;
    }

    public void deleteDetails(Long id) {
        studentRepository.deleteById(id);
    }

    public static class InvalidStudentDetails extends RuntimeException{
        public InvalidStudentDetails(String message){
            super(message);
        }
    }
}
