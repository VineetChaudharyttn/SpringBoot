package com.ttn.springbootdemo.controller;

import com.ttn.springbootdemo.entity.DataBase;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DatabaseController {
    @Autowired
    DataBase dataBase;

    @RequestMapping("/database")
    @ResponseBody
    public String database(){
        LoggerFactory.getLogger(DatabaseController.class).info("you are accessing database action   ");
        return dataBase.toString();
    }
}
