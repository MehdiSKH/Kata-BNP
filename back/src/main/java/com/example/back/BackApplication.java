package com.example.back;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackApplication {
    public static void main(String[] args) {
        System.out.println("Application is running!");
        SpringApplication.run(BackApplication.class, args);
    }
}
