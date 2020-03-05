package com.we.bijoy71.sadhinota.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("/hello")
    String hello() {
        return "Hello World";
    }
}
