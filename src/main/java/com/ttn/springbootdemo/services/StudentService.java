package com.ttn.springbootdemo.services;

import com.ttn.springbootdemo.controller.StudentController;
import com.ttn.springbootdemo.entity.Student;
import com.ttn.springbootdemo.repositories.StudentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudents(){
        LoggerFactory.getLogger(StudentController.class).error("get Student");
        List<Student> students=new ArrayList<>();
        Iterator<Student> studentIterator=studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(students::add);
        return students;
//                Arrays.asList(new Student("Vineet","Chaudhary",1),new Student("Shivam","Saxsena",2));
    }
}
