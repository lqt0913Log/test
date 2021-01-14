package com.lqt.user.controller;

import com.lqt.user.entity.UserDTO;
import com.lqt.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;
    @Value("${server.port}")
    private  String port;
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        UserDTO userDTO = userService.getUser(1);
        return "hi "+userDTO.getName()+",i am from port:" +port;
    }
}
