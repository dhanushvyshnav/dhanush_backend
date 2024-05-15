package com.excel.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class EmployeeDto {

	private Integer id;
	private String firstName;
	private String lastName;
	private String mobileNo;
	private String aadhaarNo;
	private String panNo;
	private String employeeNo;
}
