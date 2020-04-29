package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="student_details")
/***
 * student class which contains all student details
 */
public class Student
{
    @Id
    @GeneratedValue
    /***
     * student id, name and age
     */
    public int id;
    public  String name;
    public  int age;

    /***
     * students id is returned
     * @return
     */
    public int getId()
    {
        return id;
    }

    /***
     * gets student id
     * @param id
     */
    public void setId(int id)
    {
        this.id = id;
    }

    /***
     * return students name
     * @return
     */
    public String getName()
    {
        return name;
    }

    /***
     * set student name
     * @param name
     */
    public void setName(String name)
    {
        this.name = name;
    }

    /***
     * return age
     * @return
     */
    public int getAge()
    {
        return age;
    }

    /***
     * set student age
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }
}
