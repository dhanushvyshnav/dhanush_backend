package com.excel.lms.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum MaritalStatus {
 SINGLE("SINGLE"), MARRIED("MARRIED"), DIVORCED("DIVORCED");
	private final String type;
}
