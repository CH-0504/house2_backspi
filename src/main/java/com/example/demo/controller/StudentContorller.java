package com.example.demo.controller;

import com.example.demo.entity.Students;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.constraints.Null;
import java.util.List;


@Controller
public class StudentContorller {
    @Autowired
    private StudentService studentService;
    //服务器
    @RequestMapping("/showStudent")
    public String showStudent(Model model){
        //调用业务
        List<Students> list=this.studentService.getAllStudent();
        //填充数据
        model.addAttribute("list",list);
        return "index";
    }

    @RequestMapping("/delStuAction")
    public String delStuAction(int id){
        int i = this.studentService.delAllStudent(id);
        return "redirect:showStudent";
    }

    @RequestMapping("/showStudent1")
    public String showStudent1(Model model){
        //调用业务
        List<Students> list=this.studentService.getAllStudent();
        //填充数据
        model.addAttribute("list",list);
        return "student";
    }
    @RequestMapping("/getStudentData")
    @ResponseBody
    @CrossOrigin(value = "*")
    public List<Students> getStudentdata(){
        //调用业务
        List<Students> list=this.studentService.getAllStudent();
        //填充数据
        return list;
    }



}
