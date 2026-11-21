package com.example.SpringJDBC.Service;

import com.example.SpringJDBC.Model.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService
{
    public void addStudent(Student s)
    {
        System.out.println("Added");
    }
}
