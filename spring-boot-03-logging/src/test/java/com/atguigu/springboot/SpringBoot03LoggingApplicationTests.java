package com.atguigu.springboot;


import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    //记录器
    Logger logger= LoggerFactory.getLogger(getClass());

    @Test
    void contextLoads() {
        //System.out.println();


        logger.trace("只是一个trace日志");
        logger.info("只是一个info日志");
        logger.debug("只是一个debug日志");

    }

}
