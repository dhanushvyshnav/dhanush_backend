package com.excel.lms.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.lms.exception.EmployeePrimaryException;

@RestControllerAdvice
public class EmployeeExpceptionHandler {

	
	@ExceptionHandler(EmployeePrimaryException.class)
	public ResponseEntity<String> employeePrimaryException(RuntimeException exe)
	{
		return ResponseEntity.ok(exe.getMessage());
	}

}
