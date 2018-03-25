package com.example.cmpe282;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class cmpe282_autodeploy {

    @RequestMapping("/")
    String home() {
        return "Hello!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(cmpe282_autodeploy.class, args);
    }

}
