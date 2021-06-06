package com.helloworld.service;

import com.helloworld.model.Student;

import java.io.IOError;
import java.text.ParseException;

public interface StudentService {

    Long registerStudent(String firstName,String lastName,String emailId);

}
