package com.atguigu.springboot04webrestfulcrud.controller;

import com.atguigu.springboot04webrestfulcrud.exception.UserNotExistException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class MyExceptionHandler {

    //1.浏览器客户端返回的都是json
//    @ResponseBody
//    @ExceptionHandler(UserNotExistException.class)
//    public Map handlerException(UserNotExistException e){
//        Map<String,Object> map=new HashMap<>();
//        map.put("code","user.notexist");
//        map.put("meassage",e.getMessage());
//        return map;
//    }

    //
    @ExceptionHandler(UserNotExistException.class)
    public String handlerException(UserNotExistException e, HttpServletRequest request){
        Map<String,Object> map=new HashMap<>();
        map.put("code","user.notexist");
        map.put("message","用户错误");
        request.setAttribute("javax.servlet.error.status_code",500);
        request.setAttribute("ext",map);
        return "forward:/error";
    }

}
