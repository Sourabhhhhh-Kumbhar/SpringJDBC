package com.example.SpringJDBC;

import com.example.SpringJDBC.Model.Student;
import com.example.SpringJDBC.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringJdbcApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		System.out.println("Spring JDBC Application Started");

		Student s = context.getBean(Student.class);

		s.setRollNo(104);
		s.setName("Usha");
		s.setMarks(89);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

        List<Student> students = service.getStudents();
		System.out.println(students);

	}
}
