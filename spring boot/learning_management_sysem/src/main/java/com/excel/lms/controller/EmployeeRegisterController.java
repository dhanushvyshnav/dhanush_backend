package com.excel.lms.controller;
import com.excel.lms.service.EmployeePrimaryInfoService;
import java.time.LocalDate;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_PRIMARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_SECONDARY_INFO_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_BANK_DETAILS_SAVED;
import static com.excel.lms.constant.EmployeeConstant.EDUCATION_DETAILS_ADDED;
import static com.excel.lms.constant.EmployeeConstant.EMPLOYEE_ADDRESS_DETAILS_ADDED;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactDto;
import com.excel.lms.dto.ContactDto;
import com.excel.lms.dto.EducationalDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceDto;

import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excelsoft.project.lms.response.Success;
import com.excel.lms.service.EmployeePrimaryInfoService;

import lombok.Builder;
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
	
	@PostMapping(path = "/pinfo")
	public ResponseEntity<Success<String>> postPrimaryInfo(@RequestBody EmployeePrimaryInfoDto dto)
	{
		String employeeId = employeePrimaryInfoService.savePrimaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_PRIMARY_INFO_SAVED).build());
	}
	
	@PostMapping(path = "/sinfo")
	public ResponseEntity<Success<String>> postSecondaryInfo(@RequestBody EmployeeSecondaryInfoDto dto)
	{
		String employeeId = employeePrimaryInfoService.saveSecondaryInfo(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_SECONDARY_INFO_SAVED).build());
	}
	
	@PostMapping(path = "/binfo")
	public ResponseEntity<Success<String>> postBankInfo(@RequestBody BankDetailsDto dto)
	{
		String employeeId = employeePrimaryInfoService.saveBank(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).message(EMPLOYEE_BANK_DETAILS_SAVED).build());
	}
	
	@PostMapping(path = "/edinfo")
	public ResponseEntity<Success<String>> addEducationDetail(@RequestBody EducationDetailDtoList dto)
	{
		String employeeId = employeePrimaryInfoService.addEducation(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder().data(employeeId)
				.data(employeeId).isError(false).message("Education details added").build());
	}
	
	@PostMapping(path = "/adinfo")
	public ResponseEntity<Success<String>> addAddressDetail(@RequestBody AddressDetailList dto)
	{
		String employeeId = employeePrimaryInfoService.addAddressList(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(employeeId).isError(false).message("Address details added").build());
	}
	
	@PostMapping(path = "/cinfo")
	public ResponseEntity<Success<String>> addContact(@RequestBody ContactListDto dto)
	{
		String employeeId = employeePrimaryInfoService.addContactList(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Success.<String>builder().data(employeeId)
				.isError(false).message("Contact details added").build());
	}
	
	@PostMapping(path = "/Exinfo")
	public ResponseEntity<Success<String>> addExperience(@RequestBody ExperienceList dto)
	{
		String employeeId = employeePrimaryInfoService.addExperienceList(dto);
		return ResponseEntity.status(HttpStatus.ACCEPTED).body(Success.<String>builder().data(employeeId)
				.isError(false).message("Experience details added").build());
	}
}
