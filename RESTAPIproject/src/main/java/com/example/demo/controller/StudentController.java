package com.example.demo.controller;


import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController
{
    @Autowired
    private StudentDao dao;

    @ResponseBody
    @GetMapping("/getStudents")
    public List<Student> getStudents()
    {
        System.out.println("hello");
        return      (List<Student>)dao.findAll();

    }









}
