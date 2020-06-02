package com.jk.controller;


import com.jk.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello(){
        return userService.hello();
    }

    @GetMapping("/hi")
    @ResponseBody
    public String hi(){
        return userService.hi();
    }


}
