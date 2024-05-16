package com.excel.lms.dto.enums;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum AccountType {

	CURRENT("CURRENT"), SAVINGS("SAVING"), SALARY("SALARY");
	private final String accounttType;
}
