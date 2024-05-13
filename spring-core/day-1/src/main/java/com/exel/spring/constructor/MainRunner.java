package com.exel.spring.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainRunner {

	public static void main(String[] args) 
	{
		ApplicationContext context= new ClassPathXmlApplicationContext("com/exel/spring/constructor/config.xml");
		
		Employee employee =(Employee)context.getBean("employee");

		System.err.println(employee);
	
	}

}
