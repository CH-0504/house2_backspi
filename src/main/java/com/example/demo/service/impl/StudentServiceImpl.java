package com.example.demo.service.impl;

import com.example.demo.dao.StudentsMapper;
import com.example.demo.entity.Students;
import com.example.demo.entity.StudentsExample;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired(required = false)
    private StudentsMapper studentsMapper;

    @Override
    public List<Students> getAllStudent() {
        return this.studentsMapper.selectByExample(new StudentsExample());
    }

    @Override
    public int delAllStudent(int id) {
        studentsMapper.deleteByPrimaryKey(id);
        return 1;
    }
}
