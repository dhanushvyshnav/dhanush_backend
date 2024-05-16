package com.excel.demo.controller;

import java.util.List;
import static com.excel.demo.constant.EmployeeConstant.EMPLOYEE_DELETED_MESSAGE;
import static com.excel.demo.constant.EmployeeConstant.EMPLOYEE_ADDED_SUCCESS;
import static com.excel.demo.constant.EmployeeConstant.ONE_EMPLOYEE_DETAILS;
import static com.excel.demo.constant.EmployeeConstant.UPDATED_EMPLOYEE_DETAILS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.excel.demo.dto.EmployeeDto;
import com.excel.demo.response.CommonResponse;
import com.excel.demo.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
//@RequestMapping("/employee")
public class BaseController {

	@Autowired
	private final EmployeeService employeeService;

	@PostMapping("/add")
	public ResponseEntity<CommonResponse<EmployeeDto>> addEmployee(@RequestBody EmployeeDto employee) {
		EmployeeDto dto= employeeService.addEmployee(employee);
		return ResponseEntity.status(HttpStatus.OK)
				.body(CommonResponse.<EmployeeDto>builder()
						.data(dto).isError(false)
						.message(EMPLOYEE_ADDED_SUCCESS).build());
	}

	@GetMapping("/get/{id}")
	public ResponseEntity<CommonResponse<EmployeeDto>> getById(@PathVariable Integer id)
	{ EmployeeDto dto= employeeService.getEmployee(id);
	return ResponseEntity.status(HttpStatus.OK)
			.body(CommonResponse.<EmployeeDto>builder()
					.data(dto).isError(false)
					.message(ONE_EMPLOYEE_DETAILS).build());	
	}

	@GetMapping("/getAll")
	public ResponseEntity<List<EmployeeDto>> fetchAllEmployees() {
		return ResponseEntity.ok(employeeService.getAllEmployees()) ;
	}

	@DeleteMapping("/delete")
	public ResponseEntity<CommonResponse<EmployeeDto>> deleteEmployee(@RequestBody EmployeeDto dto) {
		employeeService.deleteEmployee(dto.getId());
		return ResponseEntity.status(HttpStatus.OK).
				body(CommonResponse.<EmployeeDto>builder()
						.data(dto).isError(false)
						.message(EMPLOYEE_DELETED_MESSAGE).build());
	}

	@PutMapping("/update")
	public ResponseEntity<CommonResponse<EmployeeDto>> updateEmployee(@RequestBody EmployeeDto dto)
	{
		EmployeeDto update= employeeService.updateEmployee(dto);
		return ResponseEntity.status(HttpStatus.OK).body(CommonResponse.<EmployeeDto>builder()
				.data(dto).isError(false)
				.message(UPDATED_EMPLOYEE_DETAILS).build());
	}
}
