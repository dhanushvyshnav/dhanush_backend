package com.excel.lms.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class AddressDetailsListDto {

private String employeeId;
	
	private List<AddressDetailsDto> addressDetailList;
}
