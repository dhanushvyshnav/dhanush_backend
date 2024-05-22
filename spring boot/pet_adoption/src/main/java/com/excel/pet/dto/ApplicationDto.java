package com.excel.pet.dto;

import java.time.LocalDate;

import com.excel.pet.enums.ApplicationStatus;

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
public class ApplicationDto {
	
	private Integer id;
	
	private String userId;
	
	private String petId;
	
	private ApplicationStatus applicationStatus;
	
	private LocalDate applicationDate;
	
	private LocalDate approvalDate;
	

}
