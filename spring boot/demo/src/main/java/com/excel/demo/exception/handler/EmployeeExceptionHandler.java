package com.excel.demo.exception.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.demo.exception.EmployeeNotFound;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> employeeNotFound(RuntimeException exe)
	{
		return ResponseEntity.ok(exe.getMessage());
		
	}
}
