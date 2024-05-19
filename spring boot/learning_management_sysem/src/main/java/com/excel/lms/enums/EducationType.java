package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EducationType {

	UNDER_GRADUATE("UNDER_GRADUATE"), POST_GRADUATION("POST_GRADUATION"),
	ENGINEERING("ENGINEERING"), DIPLOMA("DIMPLOMA");
	private final String type;
}
