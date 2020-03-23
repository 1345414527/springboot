package com.atguigu.springboot02config02.mapper;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@PropertySource("classpath:mapper.yml")
public class mapper {

    private int a;

    private int b;

    public int getA() {
        return a;
    }

    @Value("${mapper.a}")
    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    @Value("${mapper.b}")
    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "mapper{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
