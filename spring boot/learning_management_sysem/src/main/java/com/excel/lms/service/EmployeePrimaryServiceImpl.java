package com.excelsoft.project.lms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excelsoft.project.lms.dto.AddressDetailList;
import com.excelsoft.project.lms.dto.BankDetailsDto;
import com.excelsoft.project.lms.dto.ContactListDto;
import com.excelsoft.project.lms.dto.EducationDetailDtoList;
import com.excelsoft.project.lms.dto.EmployeePrimaryInfoDto;
import com.excelsoft.project.lms.dto.EmployeeSecondaryInfoDto;
import com.excelsoft.project.lms.dto.ExperienceList;
import com.excelsoft.project.lms.entity.AddressDetail;
import com.excelsoft.project.lms.entity.BankDetail;
import com.excelsoft.project.lms.entity.Contact;
import com.excelsoft.project.lms.entity.EducationDetail;
import com.excelsoft.project.lms.entity.EmployeePrimaryInfo;
import com.excelsoft.project.lms.entity.EmployeeSecondaryInfo;
import com.excelsoft.project.lms.entity.Experience;
import com.excelsoft.project.lms.exception.EmployeePrimaryException;
import com.excelsoft.project.lms.repository.AddressRepository;
import com.excelsoft.project.lms.repository.BankRepository;
import com.excelsoft.project.lms.repository.ContactRepository;
import com.excelsoft.project.lms.repository.EducationRepository;
import com.excelsoft.project.lms.repository.EmployeeRepository;
import com.excelsoft.project.lms.repository.EmployeeSecondaryRepository;
import com.excelsoft.project.lms.repository.ExperienceRepository;
import com.excelsoft.project.lms.utils.ObjectUtils;

@Service
public class EmployeePrimaryServiceImpl implements EmployeePrimaryInfoService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private EmployeeSecondaryRepository employeeSecondaryRepository;
	
	@Autowired
	private BankRepository bankRepository;
	
	@Autowired
	private EducationRepository educationRepository;
	
	@Autowired
	private AddressRepository addressRepository;
	
	@Autowired
	private ContactRepository contactRepository;
	
	@Autowired
	private ExperienceRepository experienceRepository;
	
	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {
		
		if(!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent())
		{
			EmployeePrimaryInfo primaryInfo = ObjectUtils.primaryInfoDto(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();
		}
//		throw new EmployeePrimaryException("Not added");
		return null;
	}
	

	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) 
	{
		
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			if(employee.getSecondaryInfo() == null)
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = ObjectUtils.dtoToEntity(dto);
				employee.setSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setPrimaryInfo(employee);
				
				return employeeRepository.save(employee).getEmployeeId();
			}
			else
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = employee.getSecondaryInfo();
				
				employeeSecondaryInfo.setPanNo(dto.getPanNo());
				employeeSecondaryInfo.setAadharNo(dto.getAadharNo());
				employeeSecondaryInfo.setFatherName(dto.getFatherName());
				employeeSecondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				employeeSecondaryInfo.setMotherName(dto.getMotherName());
				employeeSecondaryInfo.setPassportNo(dto.getPassportNo());
				employeeSecondaryInfo.setSpouseName(dto.getSpouseName());
			}
			return employeeRepository.save(employee).getEmployeeId();
		}
		return null;
	}


	@Override
	public String saveBank(BankDetailsDto dto) 
	{
		Optional<EmployeePrimaryInfo> bankOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(bankOptional.isPresent())
		{
			EmployeePrimaryInfo primaryInfo = bankOptional.get();
			if(primaryInfo.getBankDetails() == null)
			{
				BankDetail bank = ObjectUtils.bankToEntity(dto);
				primaryInfo.setBankDetails(bank);
				bank.setPrimaryInfo(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
			else
			{
				
			BankDetail bankDetail = primaryInfo.getBankDetails();
			
			bankDetail.setAccountNo(dto.getAccountNo());
			bankDetail.setAccountType(dto.getAccountType());
			bankDetail.setBankId(dto.getBankId());
			bankDetail.setBankName(dto.getBankName());
			bankDetail.setBranch(dto.getBranch());
			bankDetail.setIfscCode(dto.getIfscCode());
			bankDetail.setState(dto.getState());
		}
		return employeeRepository.save(primaryInfo).getEmployeeId();
	}
		
		return null;
	}



	@Override
	public String addEducation(EducationDetailDtoList dto) 
	{
		Optional<EmployeePrimaryInfo> optionalEducation = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalEducation.isPresent())
		{
			EmployeePrimaryInfo employee = optionalEducation.get();
			List<EducationDetail> education = dto.getEducation().stream()
					.map(ObjectUtils :: educationToEntity).toList();
			if(employee.getEducationDetails() != null)
			{
				employee.getEducationDetails().stream().forEach(educationRepository::delete);
				employee.setEducationDetails(null);
			}
			employee.setEducationDetails(education);
			education.stream().forEach(educations -> educations.setPrimaryInfo(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}


	@Override
	public String addAddressList(AddressDetailList dto) 
	{
		Optional<EmployeePrimaryInfo> optionalAddress = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalAddress.isPresent())
		{
			EmployeePrimaryInfo employee = optionalAddress.get();
			List<AddressDetail> address = dto.getAddressDetailList().stream()
					.map(ObjectUtils :: addressToEntity).toList();
			if(employee.getAddressDetails()!=null)
			{
				employee.getAddressDetails().stream().forEach(addressRepository::delete);
				employee.setAddressDetails(address);
			}
			employee.setAddressDetails(address);
			address.stream().forEach(add -> add.setPrimaryInfo(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}


	@Override
	public String addContactList(ContactListDto dto) 
	{
		Optional<EmployeePrimaryInfo> optionalContact = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalContact.isPresent())
		{
			EmployeePrimaryInfo employee = optionalContact.get();
			List<Contact> contact = dto.getContactList().stream()
					.map(ObjectUtils :: contactToEntity).toList();
			if(employee.getContacts()!=null)
			{
				employee.getContacts().stream().forEach(contactRepository :: delete);
				employee.setContacts(contact);
			}
			employee.setContacts(contact);
			contact.stream().forEach(add -> add.setPrimaryInfo(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("erroe");
	}


	@Override
	public String addExperienceList(ExperienceList dto) {
		
		Optional<EmployeePrimaryInfo> optionalExperience = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalExperience.isPresent())
		{
			EmployeePrimaryInfo employee = optionalExperience.get();
			List<Experience> experience = dto.getExperienceList().stream()
					.map(ObjectUtils :: experienceToEntity).toList();
			if(employee.getExperiences()!=null)
			{
				employee.getExperiences().stream().forEach(experienceRepository :: delete);
				employee.setExperiences(experience);
			}
			employee.setExperiences(experience);
			experience.stream().forEach(add -> add.setPrimaryInfo(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}
}
	


