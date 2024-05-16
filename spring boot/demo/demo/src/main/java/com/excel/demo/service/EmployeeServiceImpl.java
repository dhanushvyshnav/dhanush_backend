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
import com.excel.demo.util.EmployeeUtils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
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

		return EmployeeUtils.entityToDto(employee);
	}

	@Override
	public EmployeeDto getEmployee(Integer id) {
		try {
			Optional<Employee> optional= employeeRepository.findById(id);
			if(optional.isPresent()) {
				Employee employee= optional.get();
				return EmployeeUtils.entityToDto(employee);
			}
			throw new EmployeeNotFound("Employee Not found with the ID "+ id);
		}catch(EmployeeNotFound e) {
			throw e;
		}catch(Exception e) {
			log.error("EmployeeServiceImpl :: addEmployee ==>" + e.getMessage());
			throw new EmployeeNotFound("Something went wrong while fetching");
		}
	}

	@Override
	public void deleteEmployee(Integer id) {
		Optional<Employee> optional= employeeRepository.findById(id);
		if(optional.isPresent())
			employeeRepository.delete(optional.get());
		else
			throw new EmployeeNotFound(EmployeeConstant.EMPLOYEE_DELETED_MESSAGE);
	}

	@Override
	public List<EmployeeDto> getAllEmployees() {
		return employeeRepository.findAll().stream()
				.map(EmployeeUtils ::entityToDto).toList();
	}

	@Override
	public EmployeeDto updateEmployee(EmployeeDto dto) {
		Optional<Employee> optional= employeeRepository.findById(dto.getId());
		if(optional.isPresent())
		{
			Employee employee= optional.get();
			employee= EmployeeUtils.updatevalues(employee, dto);
			employeeRepository.save(employee);
		}
		return null;
	}








}
