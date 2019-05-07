package com.example.mydemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MydemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MydemoApplication.class, args);
    }

    @GetMapping
    private String ok(){
        return "ok";
    }
}
