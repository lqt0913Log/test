package com.lqt.proxy.controller;

import com.lqt.proxy.service.feign.UserFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class UserController {
    @Autowired
    private UserFeignService userFeignService;

    @GetMapping("/home")
    public String getHome (){
        return userFeignService.home("");
    }
}
