package com.example.demo.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/greetings")
public class GreetingsController {
    @GetMapping
    public ResponseEntity<String> SayHello(){
           return ResponseEntity.ok("Hello");
       }
    @GetMapping("/goodbyeee")
    public ResponseEntity<String> SayGoodBye(){
        return ResponseEntity.ok("GoodBye");
    }
}
