package com.jk.service;


import com.jk.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/hello")
    @Override
    public String hello() {
        return "调用成功...";
    }

    @Override
    public String hi() {
        return "hi...";
    }

}
