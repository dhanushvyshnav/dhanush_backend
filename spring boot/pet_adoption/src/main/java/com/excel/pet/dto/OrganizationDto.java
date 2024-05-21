package com.excel.pet.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class OrganizationDto {

	
	
	private String organizationId;	
	
	private String organizationName;
	
	private String email;
	
	private Long phoneNo;
	
}
