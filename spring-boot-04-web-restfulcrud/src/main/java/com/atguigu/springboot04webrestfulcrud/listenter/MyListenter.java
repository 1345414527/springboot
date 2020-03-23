package com.atguigu.springboot04webrestfulcrud.listenter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListenter implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("应用启动");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("应用结束");
    }
}
