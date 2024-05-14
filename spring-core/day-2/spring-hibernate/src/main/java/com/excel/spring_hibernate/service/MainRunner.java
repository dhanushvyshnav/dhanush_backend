package com.excel.spring_hibernate.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.spring_hibernate.JavaConfig;
import com.excel.spring_hibernate.dao.StudentDao;
import com.excel.spring_hibernate.entity.Student;

public class MainRunner {

	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		
		StudentDao dao= context.getBean("studentDao", StudentDao.class);
		
		Student student= new Student();
//		student.setId(12);
//		student.setName("pratheek");
//		student.setPlace("Delhi");
//		dao.insert(student);
		
//		int update=dao.update(new Student(3, "Mani", "Mysore"));
//		System.out.println(update);
		
//		int delete=dao.deleteDb(7);
//		System.out.println(delete);
		
//		Student get = dao.getStudent(5);
//		System.out.println(get);
		
		List<Student> students= dao.getAllStudent();
		System.out.println(students);
		
	}

}
