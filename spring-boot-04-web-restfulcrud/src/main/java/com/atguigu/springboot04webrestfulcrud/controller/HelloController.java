package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("hello")
  public String hello(@RequestParam("user")String user){
        if(user.equals("aaa")){throw new UserNotExistException();}
      return "hello world";
  }


  @RequestMapping("success")
    public String seccess(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("将","宏","器"));
        //classpath:/templates/success.html
      return "redirect:/test/success.html";
  }

//  @RequestMapping({"/","index.html"})
//  public String index(){
//        return "index";
//  }

}
