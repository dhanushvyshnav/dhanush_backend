package com.excel.spring_jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.excel.spring_jdbc.dao.StudentDao;
import com.excel.spring_jdbc.entity.Student;

public class App 
{
	public static void main( String[] args )
	{
		ApplicationContext context= new AnnotationConfigApplicationContext(JdbcConfig.class);
		StudentDao dao= context.getBean("studentDao",StudentDao.class);

		Student student= new Student();
		    	student.setId(14);
		    	student.setName("abhi");
		    	student.setCity("kannur");
		    	
		    	int res= dao.insertStudnets(student);
		    	System.out.println(res);


		//    	int res= dao.updateStudnets(new Student(1,"Dhoni","Ranchi"));
		//    	System.out.println(res);

		//    	int delete= dao.deleteStudents(15);
		//    	System.out.println(delete);

//		List<Student> list =(List<Student>) dao.getAllStudents();
//
//		for(Student index : list) {
//			System.out.println(index); }
	
	
	
	}
}
