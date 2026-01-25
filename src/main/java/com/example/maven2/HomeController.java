package com.example.maven2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return "Hello BR-CHANDAN from Spring Boot Maven App!";
    }
}
