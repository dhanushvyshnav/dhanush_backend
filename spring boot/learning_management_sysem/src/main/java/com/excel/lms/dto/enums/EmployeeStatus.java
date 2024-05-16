package com.excel.lms.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EmployeeStatus {

	ACTIVE("ACTIVE"), TERMINATED("TERMINATED"), 
	NOTICE_PERIOD("NOTICE_PERIOD"), ABSCONDED("ABSCONDED");
	private final String status;
}
