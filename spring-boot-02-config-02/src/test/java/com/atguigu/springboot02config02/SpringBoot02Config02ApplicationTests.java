package com.atguigu.springboot02config02;

import com.atguigu.springboot02config02.service.service;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot02Config02ApplicationTests {


    @Autowired
    private service service;

    @Test
    void contextLoads() {
        System.out.println(service);
    }

}
