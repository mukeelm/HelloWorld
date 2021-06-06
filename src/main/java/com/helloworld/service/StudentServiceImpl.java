package com.helloworld.service;

import com.helloworld.repository.StudentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl  implements  StudentService {

    public com.helloworld.repository.StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Long registerStudent(String firstName, String lastName, String emailId) {
        return studentRepository.registerStudent(firstName, lastName, emailId);
    }
}
