package com.example.SpringJDBC;

import com.example.SpringJDBC.Model.Student;
import com.example.SpringJDBC.Service.StudentService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringJdbcApplication
{
	public static void main(String[] args)
	{
		ApplicationContext context = SpringApplication.run(SpringJdbcApplication.class, args);

		System.out.println("Spring JDBC Application Started");

		Student s = context.getBean(Student.class);

		s.setRollNo(101);
		s.setName("Spring JDBC");
		s.setMarks(79);

		StudentService service = context.getBean(StudentService.class);

		service.addStudent(s);

	}

}
