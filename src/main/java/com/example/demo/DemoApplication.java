package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//注意:SpringBootApplication注解会自动扫描启动类
//所在包下的spring注及其子包下的spring注解
//使用ComponentScan注解指定扫描某包下的spring注解
//@ComponentScan(value = "com.example")
//添加扫描mybatis的dao层接口，生成实现类
@MapperScan(value = "com.example.demo.dao")
@ServletComponentScan(basePackages = {"com.example.demo.filter"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
