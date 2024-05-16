package com.excel.demo.service;

import java.util.List;

import com.excel.demo.dto.EmployeeDto;

public interface EmployeeService {

	public EmployeeDto addEmployee(EmployeeDto dto);
	
	public void deleteEmployee(Integer id);
	
	public List<EmployeeDto> getAllEmployees();
	
	public EmployeeDto getEmployee(Integer id);
	
	public EmployeeDto updateEmployee(EmployeeDto dto);
	
	
}
