package com.excel.lms.dto;

import com.excel.lms.enums.ContactType;

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
public class ContactDto {

private Integer contactId;
	
private ContactType contactType;
	private String contactNo;
	private String employeeId;
}
