package com.excel.lms.service;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationalDetailsDtoList;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsDtoList;

public interface EmployeePrimaryInfoService {

	public String savePrimaryInfo(EmployeePrimaryInfoDto dto);


	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto);


	public String saveBank(BankDetailsDto dto);


	public String addEducation(EducationalDetailsDtoList dto);


	public String addAddressList(AddressDetailsListDto dto);


	public String addContactList(ContactListDto dto);


	public String addExperienceList(ExperienceListDto dto);


	public String addSkills(TechnicalSkillsDtoList dto);


}
