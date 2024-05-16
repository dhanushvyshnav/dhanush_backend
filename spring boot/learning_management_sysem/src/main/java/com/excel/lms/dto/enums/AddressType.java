package com.excel.lms.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AddressType {

	PERMANENT("PERMANENT"), TEMPORARY("TEMPORARY");
	private final String addresssType;
	
}
