package com.excel.pet.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ApplicationListDto {

	private String userId;
	
	private String petId;
	
	private List<ApplicationDto> applicationList;
}
