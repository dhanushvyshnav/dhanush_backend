package com.excel.lms.service;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactDto;
import com.excel.lms.dto.EducationalDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceDto;
import com.excel.lms.entity.EmployeeSecondaryInfo;

public interface EmployeePrimaryInfoService {

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);


	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);


	public String saveBank(BankDetailsDto dto);


	public String addEducation(EducationalDetailsDto dto);


	public String addAddressList(AddressDetailsDto dto);


	public String addContactList(ContactDto dto);


	public String addExperienceList(ExperienceDto dto);

}
