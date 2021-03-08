package com.lqt.user.controller;

import com.lqt.user.entity.UserDTO;
import com.lqt.user.service.UserService;
import org.apache.tomcat.util.threads.ThreadPoolExecutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

@RestController
public class UserController {
    @Autowired
    private  UserService userService;
    @Value("${server.port}")
    private  String port;
    @GetMapping("/hi")
    public String home(@RequestParam String name) {
        UserDTO userDTO = userService.getUser(1);
//        String s = "s";
//        String t = "t";
//        if(s.equals(t)){
//            Map<String,Object> map = new HashMap<String,Object>();
//            return null;
//        }
        // 线程池
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5,10,1000, TimeUnit.MICROSECONDS,new ArrayBlockingQueue<>(10));


        return "hi "+userDTO.getName()+",i am from port:" +port;
    }
}
