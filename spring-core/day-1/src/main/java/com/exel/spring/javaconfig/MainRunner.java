package com.exel.spring.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainRunner {

	public static void main(String[] args) {

		ApplicationContext  context= new AnnotationConfigApplicationContext(JavaCofig.class);
		
		Student student= context.getBean("std", Student.class);
		student.study();
	}

}
