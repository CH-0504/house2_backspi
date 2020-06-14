package com.example.demo.service;

import com.example.demo.entity.Students;


import java.util.List;


public interface StudentService {
    public List<Students> getAllStudent();

    public int delAllStudent(int id);
}
