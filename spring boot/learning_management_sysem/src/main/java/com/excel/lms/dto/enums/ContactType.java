package com.excel.lms.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum ContactType {

	PERSONAL("PERSONAL"), OFFICE("OFFICE");
	private final String type;
}
