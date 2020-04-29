package com.example.demo.dao;


import com.example.demo.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/***
 * student repository
 */
@Repository
public interface StudentDao extends CrudRepository<Student, Integer> {
}
