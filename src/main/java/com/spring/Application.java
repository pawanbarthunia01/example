package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/order")
public class Application {

    @GetMapping
    public String welcome(){
        return "Welcome to api....";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
