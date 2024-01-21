package com.johanaerens.demo.controller;

import com.johanaerens.demo.MessageProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    private final MessageProperties properties;

    public HelloController(MessageProperties properties) {
        this.properties = properties;
    }


    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "! Welcome " + properties.getMessage();
    }
}
