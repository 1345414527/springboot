package com.atguigu.springboot.config;

import com.atguigu.springboot.service.ServiceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Configuration:指明当前类是一个配置类：就是来代替之前的spring配置文件 在配置文件中通过<bean></bean>标签添加组件
 */
@Configuration
public class MyAutoConfig {

    //将方法的返回值添加到容器中
    @Bean
    public ServiceBean serviceBean() {
        System.out.println("添加组件");
        return new ServiceBean();
    }

}
