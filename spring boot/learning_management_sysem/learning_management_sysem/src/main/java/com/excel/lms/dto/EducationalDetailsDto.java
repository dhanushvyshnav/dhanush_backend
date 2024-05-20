package com.excel.lms.dto;

import com.excel.lms.enums.EducationType;

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
public class EducationalDetailsDto {

private Integer educationId;
	
private EducationType educationType;
	private String yearOfPassing;
	private Double percentage;
	private String universityName;
	private String instituteName;
	private String specialization;
	private String state;
	private String employeeId;
}
