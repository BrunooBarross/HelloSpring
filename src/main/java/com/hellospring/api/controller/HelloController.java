package com.hellospring.api.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/hello")
public class HelloController {
    
    @GetMapping
    public ResponseEntity<String> helloSpring () {
        return ResponseEntity.ok().body("Hello Spring!");
    }
}
