package com.atguigu.springboot08startertest.controller;

import com.example.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("hello")
    public String hello(){
        String str=helloService.sayHelloAtguigu("haha");
        return str;
    }

}
