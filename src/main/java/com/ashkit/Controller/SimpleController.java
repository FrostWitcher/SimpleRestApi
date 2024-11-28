package com.ashkit.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class SimpleController {

    @RequestMapping("/hello")
    public String hello(){

        return "Hello World";
    }
}
