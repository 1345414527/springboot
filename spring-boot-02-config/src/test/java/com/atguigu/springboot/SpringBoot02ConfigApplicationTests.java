package com.atguigu.springboot;

import com.atguigu.springboot.bean.Person;
import com.atguigu.springboot.service.ServiceBean;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * SpringBoot的单元测试
 * <p>
 * 可以在测试期间很方便的类似编码一样进行自动注入
 */


@SpringBootTest
class SpringBoot02ConfigApplicationTests {

    @Resource
    Person person;

    @Autowired
    ServiceBean serviceBean;

    @Test
    void contextXml() {
        System.out.println(serviceBean.getClass().toString());
    }


    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
