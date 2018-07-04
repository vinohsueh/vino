package com.vino.shop.auth.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${foo}")
    private String foo;

    @RequestMapping("/hi")
    public String getFo(){
        return foo;
    }
}
