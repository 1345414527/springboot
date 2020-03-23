package com.atguigu.springboot02config02.service;

import com.atguigu.springboot02config02.mapper.mapper;
import org.springframework.stereotype.Service;

@Service
public class service {
    private com.atguigu.springboot02config02.mapper.mapper mapper;

    public service(com.atguigu.springboot02config02.mapper.mapper mapper) {
        this.mapper = mapper;
    }

    @Override
    public String toString() {
        return "service{" +
                "mapper=" + mapper +
                '}';
    }
}
