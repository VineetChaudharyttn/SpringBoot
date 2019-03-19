package com.ttn.springbootdemo.controller;

import com.ttn.springbootdemo.entity.User;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    User user;

    @RequestMapping("/user")
    @ResponseBody
    public String getUserData(){
        LoggerFactory.getLogger(UserController.class).info("You are accessing User action.");
        return user.toString();
    }
}
