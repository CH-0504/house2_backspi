package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@Controller
//@RestController
public class TestController {

    @RequestMapping("/getHw")
    @ResponseBody
    public String getHw(){
        return "eeeee";
    }

   @RequestMapping("/goIndex")
    public String goIndex(){
      //返回视图
       return "index";
   }


}
