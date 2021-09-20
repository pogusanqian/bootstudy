package com.pogu.bootstudy.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/getHello")
    public String getHello() {
        return "Hello World";
    }
}
