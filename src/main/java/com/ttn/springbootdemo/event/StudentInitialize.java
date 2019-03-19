package com.ttn.springbootdemo.event;

import com.ttn.springbootdemo.controller.StudentController;
import com.ttn.springbootdemo.entity.Student;
import com.ttn.springbootdemo.repositories.StudentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentInitialize {
    @Autowired
    StudentRepository studentRepository;
    @EventListener(ContextRefreshedEvent.class)
    public void init(){

           for (int i=1;i<=10;i++){
               LoggerFactory.getLogger(StudentController.class).error("-------------init "+i);
               Student student=new Student("Firstname","Lastname",i);
               studentRepository.save(student);
               System.out.println("Student "+i+" is created.");
           }


    }
}
