package com.jk.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "jx-provider")
public interface UserService {

    @GetMapping("/hello")
    String hello();

    @GetMapping("/hi")
    String hi();
}
