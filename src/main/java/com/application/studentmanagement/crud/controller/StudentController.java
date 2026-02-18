package com.application.studentmanagement.crud.controller;

import ch.qos.logback.core.model.Model;
import com.application.studentmanagement.crud.entity.Student;
import com.application.studentmanagement.crud.service.StudentServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class StudentController {

    private final StudentServices studentServices;
    @Autowired
    public StudentController(StudentServices studentServices) {
        this.studentServices = studentServices;
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        Student savedstudent = studentServices.addStudent(student);
        return ResponseEntity.ok(savedstudent);
    }
    @GetMapping("/getdetails/{id}")
    public ResponseEntity<Student> getStudentDetails(@PathVariable("id") Long id){
        Student details = studentServices.getDetails(id);
        return ResponseEntity.ok(details);
    }
    @PutMapping("/updateDetails")
    public ResponseEntity<Student> updateDetails(@RequestBody Student student){
        Student updatedDetails = studentServices.updateDetails(student);
        return ResponseEntity.ok(updatedDetails);
    }
    @DeleteMapping("/deleteDetails/{id}")
    public ResponseEntity<Student> deleteStudents(@PathVariable("id") Long id ){
        studentServices.deleteDetails(id);
        return ResponseEntity.ok().build();
    }

    public static class StudentDetailsNotFound extends RuntimeException{
        public StudentDetailsNotFound(String message){
            super(message);
        }
    }
}
