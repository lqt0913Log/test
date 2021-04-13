package com.lqt.user.controller;

import com.lqt.user.service.impl.UserServiceEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class DemoController {
    @Autowired
    private UserServiceEvent userServiceEvent;


    @GetMapping("/register")
    public String register(String username) {
        userServiceEvent.register(username);
        return "success";
    }

}
