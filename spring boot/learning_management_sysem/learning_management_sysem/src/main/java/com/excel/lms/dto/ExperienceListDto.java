package com.excel.lms.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter

public class ExperienceListDto {

private String employeeId;
	
	private List<ExperienceDto> experienceList;
}
