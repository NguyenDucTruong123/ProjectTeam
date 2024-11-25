package com.example.projectteam.Controller;

import com.example.projectteam.ProjectTeamApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TestHello {
    public static void main(String[] args) {
        SpringApplication.run(ProjectTeamApplication.class, args);
    }
    @GetMapping("/TestController")
    public String hello(@RequestParam(value = "name", defaultValue = "Truong") String name) {
        return String.format("Hello %s!", name);
    }
}