package com.capstone.capstoneProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/req")
public class DemoController {
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello This program is going to pushed to github";
    }
}