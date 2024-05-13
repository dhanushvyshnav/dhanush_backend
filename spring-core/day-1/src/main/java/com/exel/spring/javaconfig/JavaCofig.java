package com.exel.spring.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.exel.spring.javaconfig")
public class JavaCofig 
{
	@Bean(name = {"student", "std", "demoStudent"})
	public Student getStudent()
	{
		return new Student();
	}
	@Bean
	public Samosa getSamosa()
	{
		return new Samosa();
	}
}
