package com.atguigu.springboot04webrestfulcrud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.lang.reflect.Method;
import java.util.Map;

@Controller
public class LoginController {

//    @DeleteMapping @GetMapping @PutMapping
//    @RequestMapping(value = "/user/login",method = RequestMethod.POST)
    @PostMapping(value = "/user/login")
    public String login(@RequestParam(value="username",required = true) String username,
                        @RequestParam(value = "password",required = true) String password,
                        Map<String,Object> map, HttpSession session){
        if(!StringUtils.isEmpty(username)&&"123456".equals(password)){
            //登录成功,防止表单反复提交，使用重定向。
            // 并且重定向可以获取css资源
            session.setAttribute("loginUser",username);
            //跳转到dashboard.html，因为是重定向，无妨访问私有资源，需要经过viewController
            return "redirect:/main.html";
        }else{
            //登陆失败
            map.put("msg","用户名密码错误");
            return "index";
        }
    }
}
