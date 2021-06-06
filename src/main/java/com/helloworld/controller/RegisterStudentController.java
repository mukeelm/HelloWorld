package com.helloworld.controller;

import com.helloworld.model.Student;
import com.helloworld.service.StudentService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;




@RestController
public class RegisterStudentController  extends SpringBootServletInitializer {
    public StudentService studentService;

    @Autowired
    public RegisterStudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @ResponseBody
    @PostMapping(value = "registerStudent", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ApiOperation(value = "Register details of student", notes = "This Method will register the student", response = Student.class)
    public Long registerStudent(@RequestBody Student student) {
        try {
            studentService.registerStudent(student.getFirstName(),student.getLastName(),student.getEmailId());
        } catch (Exception e) {
            e.getStackTrace();
        }

        return student.getEmpID();
    }
}


