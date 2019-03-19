package com.ttn.springbootdemo.controller;

import com.ttn.springbootdemo.entity.Student;
import com.ttn.springbootdemo.services.StudentService;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @RequestMapping("/")
    public List<Student> studentController(){
        LoggerFactory.getLogger(StudentController.class).info("you are accessing Student action.");
        return studentService.getStudents();
    }
}
