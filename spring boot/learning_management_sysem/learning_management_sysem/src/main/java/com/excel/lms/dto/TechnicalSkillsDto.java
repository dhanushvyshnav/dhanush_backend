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
public class TechnicalSkillsDto {

	private Integer technicalId;

	private String skillType;
	private String skillRating;
	private Integer yearOfExperience;
	private String employeeId;

}
