package com.excel.demo.exception;

public class EmployeeNotFound extends RuntimeException 
{

	public static final long serialVersionUID =1L;
	
	public EmployeeNotFound(String message)
	{
		super(message);
	}
}
