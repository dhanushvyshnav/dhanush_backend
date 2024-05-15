package com.excel.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class BaseController {

	@Autowired
	private final EmployeeService employeeService;
	
	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployees()) ;
	}

	@GetMapping("/getId")
	public ResponseEntity<EmployeeDto> getById(@PathVariable int id)
	{ EmployeeDto dto= employeeService.getById(id);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
		
	}
	@PostMapping("/add")
	public ResponseEntity<EmployeeDto> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto= employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK).body(dto);
	}

	@PutMapping("/put")
	public ResponseEntity<String> homePutReq(@PathVariable String str1, @RequestParam String str2) {
		return ResponseEntity.status(HttpStatus.OK).body(str1+ "  "+ str2);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteEmployee(@RequestBody EmployeeDto dto) {
		employeeService.deleteEmployee(dto);
		return ResponseEntity.ok(EmployeeConstant.EMPLOYEE_DELETED_SUCCESSFULLY);
	}
	
	
}
