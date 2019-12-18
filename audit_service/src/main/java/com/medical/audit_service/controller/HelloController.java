package com.medical.audit_service.controller;

import com.medical.audit_service.entity.User;
import com.medical.audit_service.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private UserService userService;

    @RequestMapping("/hello")
    public String GetUser() {
        return "<h1>hey man!</h1>";
    }

    @GetMapping("/select")
    public String selectUser(){
        User user = new User();
        user = userService.getUserById(1);
        return "user:"+user;
    }
}
