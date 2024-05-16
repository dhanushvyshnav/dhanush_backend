package com.excel.lms.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Designation {

	TRAINEE("TRAINEE"), MENTOR("MENTOR"),
	DEVELOPER("DEVELOPER"), TESTER("TESTER"), OTHERS("OTHERS");
	
	private final String designationType;
}
