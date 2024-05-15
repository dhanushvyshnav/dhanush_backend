package com.excel.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.demo.constant.EmployeeConstant;
import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.entity.Employee;
import com.excel.demo.exception.EmployeeNotFound;
import com.excel.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	//List<Employee> employees = new ArrayList<Employee>();
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public EmployeeDto addEmployee(EmployeeDto dto) {
	
		Employee employee = Employee.builder().firstName(dto.getFirstName()).
				lastName(dto.getLastName()).
				mobileNo(dto.getMobileNo()).
				aadhaarNo(dto.getAadhaarNo()).
				panNo(dto.getPanNo()).
				employeeNo(dto.getEmployeeNo()).build();

//	employee.setId((int)(Math.random()*10));
//	employees.add(employee);
		
		Employee save= employeeRepository.save(employee);
	
	return EmployeeDto.builder().id(save.getId()).
			aadhaarNo(save.getAadhaarNo()).
			firstName(save.getFirstName()).
			lastName(save.getLastName()).
			mobileNo(save.getMobileNo()).
			panNo(save.getPanNo()).
			employeeNo(save.getEmployeeNo()).build(); 
	}

	@Override
	public void deleteEmployee(EmployeeDto dto) {
		Optional<Employee> optional= employeeRepository.findById(dto.getId());
		if(optional.isPresent())
			employeeRepository.delete(optional.get());
		else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_DELETED_SUCCESSFULLY);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepository.findAll().stream().map(e-> EmployeeDto.builder()
				.id(e.getId()).aadhaarNo(e.getAadhaarNo())
				.firstName(e.getFirstName()).lastName(e.getLastName())
				.mobileNo(e.getMobileNo()).panNo(e.getPanNo())
				.employeeNo(e.getEmployeeNo()).build()).toList();
		
	}

	@Override
	public EmployeeDto getById(int id) {
		
		return employeeRepository.findAll().stream().map(e-> EmployeeDto.builder()
				.id(e.getId()).aadhaarNo(e.getAadhaarNo())
				.firstName(e.getFirstName()).lastName(e.getLastName())
				.mobileNo(e.getMobileNo()).panNo(e.getPanNo())
				.employeeNo(e.getEmployeeNo()).build()).toList();
	}

	
	
	
	
	
}
