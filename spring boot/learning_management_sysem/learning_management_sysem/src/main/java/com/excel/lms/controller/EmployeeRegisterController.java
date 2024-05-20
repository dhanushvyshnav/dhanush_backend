package com.excel.lms.controller;
import com.excel.lms.service.EmployeePrimaryInfoService;
import java.time.LocalDate;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_PRIMARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_SECONDARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_BANK_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EDUCATION_DETAILS_ADDED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_ADDRESS_DETAILS_ADDED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_CONTACT_DETAILS_ADDED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_EXPERIENCE_DETAILS_ADDED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationalDetailsDtoList;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsDtoList;
import com.excel.lms.response.Success;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/employee", method = {RequestMethod.POST, RequestMethod.PUT})
@RestController
public class EmployeeRegisterController {

	@Autowired
	private final EmployeePrimaryInfoService employeePrimaryInfoService;

	@GetMapping(path = "/get")
	public EmployeePrimaryInfoDto get()
	{
		return EmployeePrimaryInfoDto.builder().dateOfJoining(LocalDate.now()).build();
	}

	@PostMapping(path = "/primaryinfo")
	public ResponseEntity<Success<String>> postPrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto)
	{
		String employeeId = employeePrimaryInfoService.savePrimaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_PRIMARY_INFO_SAVED).build());
	}

	@PostMapping(path = "/secondinfo")
	public ResponseEntity<Success<String>> postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto)
	{
		String employeeId = employeePrimaryInfoService.saveSecondaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_SECONDARY_INFO_SAVED).build());
	}

	@PostMapping(path = "/bankinfo")
	public ResponseEntity<Success<String>> postBankInfo(@RequestBody BankDetailsDto dto)
	{
		String employeeId = employeePrimaryInfoService.saveBank(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_BANK_DETAILS_SAVED).build());
	}


	                                 // ONE_TO_MANY


	@PostMapping(path = "/eduinfo")
	public ResponseEntity<Success<String>> addEducationDetail(@RequestBody EducationalDetailsDtoList dto)
	{
		String employeeId = employeePrimaryInfoService.addEducation(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder().data(employeeId)
				.data(employeeId).isError(false).message(EDUCATION_DETAILS_ADDED).build());
	}

	@PostMapping(path = "/addressinfo")
	public ResponseEntity<Success<String>> addAddressDetail(@RequestBody AddressDetailsListDto dto)
	{
		String employeeId = employeePrimaryInfoService.addAddressList(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).isError(false).message(EMPLOYEE_ADDRESS_DETAILS_ADDED).build());
	}

	@PostMapping(path = "/Experienceinfo")
	public ResponseEntity<Success<String>> addExperience(@RequestBody ExperienceListDto dto)
	{
		String employeeId = employeePrimaryInfoService.addExperienceList(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Success.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_EXPERIENCE_DETAILS_ADDED).build());
	}
	@PostMapping(path = "/contacinfo")
	public ResponseEntity<Success<String>> addContact(@RequestBody ContactListDto dto)
	{
		String employeeId = employeePrimaryInfoService.addContactList(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Success.<String>builder().data(employeeId)
				.isError(false).message(EMPLOYEE_CONTACT_DETAILS_ADDED).build());
	}
	
	@PostMapping(path = "/skilltechinfo")
	public ResponseEntity<Success<String>> addSkill(@RequestBody TechnicalSkillsDtoList dto)
	{
		String employeeId = employeePrimaryInfoService.addSkills(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Success.<String>builder().data(employeeId)
				.isError(false).message("skills details added").build());
	}

}
