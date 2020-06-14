package com.example.demo;

import com.example.demo.dao.StudentsMapper;
import com.example.demo.entity.Students;
import com.example.demo.entity.StudentsExample;
import com.example.demo.service.StudentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)  //以spring的方式运行
@SpringBootTest  //spri动ngboot工程测试  自动从启动类运行
public class DemoApplicationTests {

  /*  @Autowired(required = false)
    private StudentsMapper studentsMapper;*/
  @Autowired
  private StudentService studentService;




    @Test
    public void contextLoads() {
        List<Students> students = this.studentService.getAllStudent();
        System.out.println("总共查询到多少行:"+students.size());
    }

    @Test
    public void delStudent(int id){
        int i = this.studentService.delAllStudent(id);

    }

}
