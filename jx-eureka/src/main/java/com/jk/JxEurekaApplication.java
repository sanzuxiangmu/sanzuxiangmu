package com.jk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class JxEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JxEurekaApplication.class, args);
    }

}
