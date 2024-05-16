package com.excel.lms.dto;

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
public class EmployeeSecondaryInfoDto {

private Integer secondaryId;
	
	private String panNo;
	private String aadhaarNo;
	private String fatherName;
	private String motherName;
	private String spouceName;
	private String passsportNo;
	private String maritalStatus;
	
}
