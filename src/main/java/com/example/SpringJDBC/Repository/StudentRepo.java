package com.example.SpringJDBC.Repository;


import com.example.SpringJDBC.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo
{
    public void save(Student s)
    {
        System.out.println("Added");
    }

    public List<Student> findAll()
    {
        List<Student> students = new ArrayList<>();
        return students;
    }

}
