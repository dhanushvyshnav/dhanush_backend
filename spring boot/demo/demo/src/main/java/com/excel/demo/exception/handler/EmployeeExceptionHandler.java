package com.excel.demo.exception.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.excel.demo.exception.EmployeeNotFound;
import com.excel.demo.response.CommonResponse;

@RestControllerAdvice
public class EmployeeExceptionHandler {

	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<CommonResponse<String>> employeeNotFound(RuntimeException exe)
	{
		return ResponseEntity.status(HttpStatus.OK).
				body(CommonResponse.<String>builder().
						data(null).isError(true).
						message(exe.getMessage()).build());
		
	}
}
