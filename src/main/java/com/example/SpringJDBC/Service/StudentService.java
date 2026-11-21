package com.example.SpringJDBC.Service;

import com.example.SpringJDBC.Model.Student;
import com.example.SpringJDBC.Repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService
{
    private StudentRepo studentRepo;

    public StudentRepo getStudentRepo()
    {
        return studentRepo;
    }
    @Autowired
    public void setStudentRepo(StudentRepo studentRepo)
    {
        this.studentRepo = studentRepo;
    }

    public void addStudent(Student s)
    {
        studentRepo.save(s);
    }

    public List<Student> getStudents()
    {
        return studentRepo.findAll();
    }
}
