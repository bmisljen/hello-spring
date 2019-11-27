package com.example.hellospring;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class HelloSpringApplication {

    @RequestMapping("/")
    String home() {
        return "Hello Spring!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloSpringApplication.class, args);
    }
}
