package com.tuling.jenkdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping
@ResponseBody
public class TestController {
    @RequestMapping("/hello")
    public String hello(){
        //111   222
        
        return "Hello world";
    }
}
