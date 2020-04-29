package com.example.demo.controller;


import com.example.demo.dao.StudentDao;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import java.util.List;


/***
 * A rest controller to get student details
 */
@RestController
public class StudentController
{
    @Autowired
    private StudentDao dao;

    @ResponseBody
    @GetMapping("/getStudents")
/***
 * Method to display all student details
 */
    public List<Student> getStudents()
    {
        System.out.println("hello");
        return      (List<Student>)dao.findAll();

    }









}
