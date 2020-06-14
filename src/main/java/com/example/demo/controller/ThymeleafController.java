package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class ThymeleafController {
    @RequestMapping("/hello")
    public String hello(Model model, HttpSession session){
        //返回thymeleaf模板作为视图 也就是网页
        //System.out.println("我要进控制器");
        model.addAttribute("name","thymeleaf如何简单");
        model.addAttribute("age",18);
        model.addAttribute("names",new String[]{"张三","李四","王五"});
        session.setAttribute("sss","进入session");
        return "hello";
    }

}
