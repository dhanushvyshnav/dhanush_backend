package com.excel.lms.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.excel.lms.dto.AddressDetailsDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactDto;
import com.excel.lms.dto.EducationalDetailsDto;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceDto;
import com.excel.lms.dto.TechnicalSkillsDto;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.Contact;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;

public class ObjectUtil {

	private ObjectUtil()
	{

	}

	public static EmployeePrimaryInfo primaryInfoDto(EmployeePrimaryInfoDto dto)
	{
		return EmployeePrimaryInfo.builder().primaryId(dto.getPrimaryId()).employeeId(dto.getEmployeeId())
				.employeeName(dto.getEmployeeName()).dateOfJoining(dto.getDateOfJoining())
				.dateOfBirth(dto.getDateOfBirth()).designation(dto.getDesignation())
				.bloodGroup(dto.getBloodGroup()).email(dto.getEmail())
				.empoyeeStatus(dto.getEmployeeStatus())
				.gender(dto.getGender()).nationality(dto.getNationality()).build();
	}

	public static EmployeeSecondaryInfo dtoToEntity(EmployeeSecondaryInfoDto employee)
	{
		return EmployeeSecondaryInfo.builder().secondaryId(employee.getSecondaryId()).aadhaarNo(employee.getAadhaarNo())
				.fatherName(employee.getFatherName()).maritalStatus(employee.getMaritalStatus()).motherName(employee.getMotherName())
				.panNo(employee.getPanNo()).passsportNo(employee.getPassportNo()).spouceName(employee.getSpouceName()).build();
	}

	public static BankDetails bankToEntity(BankDetailsDto bank)
	{
		return BankDetails.builder().bankId(bank.getBankId()).accountNo(bank.getAccountNo())
				.acoountType(bank.getAcoountType())
				.bankName(bank.getBankName()).branch(bank.getBranch()).state(bank.getState())
				.ifsc(bank.getIfsc()).build();
	}

	
	
	                // <--- ONE_TO_MANY--->

	public static List<EducationDetails> educationToEntity(List<EducationalDetailsDto> educations) 
	{   
		return educations.stream()
	    		.map(x -> EducationDetails.builder().educationType(x.getEducationType())
	            .yearOfPassing(x.getYearOfPassing()).percentage(x.getPercentage()).instituteName(x.getInstituteName())
	            .universityName(x.getUniversityName()).specialization(x.getSpecialization()).build())
	            .collect(Collectors.toList());
	}

	public static List<AddressDetails> addressToEntity(List<AddressDetailsDto> address)
	{
		return address.stream().map(x -> AddressDetails.builder().addressType(x.getAddressType()).
				doorNo(x.getDoorNo()).street(x.getStreet()).locality(x.getLocality()).
				city(x.getCity()).state(x.getState()).pincode(x.getPincode()).landmark(x.getLandmark())
				.build()).collect(Collectors.toList());
	}

	public static List<Experience> experienceToEntity(List<ExperienceDto> experience)
	{
		return experience.stream().map(e ->Experience.builder().companyName(e.getCompanyName()).yearsOfExperience(e.getYearsOfExperience()).
				dateOfJoining(e.getDateOfJoining()).dateOfRelieving(e.getDateOfRelieving()).designation(e.getDesignation()).
				location(e.getLocation()).build()).collect(Collectors.toList());
	}

	public static List<Contact> contactToEntity(List<ContactDto> contact)
	{
		return contact.stream().map(e -> Contact.builder().contactId(e.getContactId()).contactNo(e.getContactNo())
				.contactType(e.getContactType()).build()).collect(Collectors.toList());
	}
	
	
	
	                             // MANY_TO_MANY
	
	
	
	public static TechnicalSkills dtoToSkillList(TechnicalSkillsDto skill) 
	{
		return TechnicalSkills.builder().skillType(skill.getSkillType()).skillRating(skill.getSkillRating())
				.yearOfExperience(skill.getYearOfExperience()).primaryinfoo(new ArrayList<>()).build();

	}
}
