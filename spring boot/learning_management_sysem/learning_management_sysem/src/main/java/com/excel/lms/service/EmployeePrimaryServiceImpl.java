package com.excel.lms.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.excel.lms.utils.ObjectUtil;

import com.excel.lms.dto.AddressDetailsListDto;
import com.excel.lms.dto.BankDetailsDto;
import com.excel.lms.dto.ContactListDto;
import com.excel.lms.dto.EducationalDetailsDtoList;
import com.excel.lms.dto.EmployeePrimaryInfoDto;
import com.excel.lms.dto.EmployeeSecondaryInfoDto;
import com.excel.lms.dto.ExperienceListDto;
import com.excel.lms.dto.TechnicalSkillsDtoList;
import com.excel.lms.entity.AddressDetails;
import com.excel.lms.entity.BankDetails;
import com.excel.lms.entity.Contact;
import com.excel.lms.entity.EducationDetails;
import com.excel.lms.entity.EmployeePrimaryInfo;
import com.excel.lms.entity.EmployeeSecondaryInfo;
import com.excel.lms.entity.Experience;
import com.excel.lms.entity.TechnicalSkills;
import com.excel.lms.exception.EmployeePrimaryException;

import com.excel.lms.repository.AddressRepository;
import com.excel.lms.repository.BankRepository;
import com.excel.lms.repository.ContactRepository;
import com.excel.lms.repository.EducationRepository;
import com.excel.lms.repository.EmployeeRepository;
import com.excel.lms.repository.EmployeeSecondaryRepository;
import com.excel.lms.repository.ExperienceRepository;
import com.excel.lms.repository.TechnicalSkillsRepository;

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
	
	@Autowired
	private TechnicalSkillsRepository techRepository;
	
	@Override
	public String savePrimaryInfo(EmployeePrimaryInfoDto dto) {
		
		if(!employeeRepository.findByEmployeeId(dto.getEmployeeId()).isPresent())
		{
			EmployeePrimaryInfo primaryInfo = ObjectUtil.primaryInfoDto(dto);
			EmployeePrimaryInfo employee = employeeRepository.save(primaryInfo);
			return employee.getEmployeeId();
		}
//	throw new EmployeePrimaryException("Not added check again");
		return null;
	}
	

	@Override
	public String saveSecondaryInfo(EmployeeSecondaryInfoDto dto) 
	{
		Optional<EmployeePrimaryInfo> employeeOptional= employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			if(employee.getSecondaryInfo() == null)
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = ObjectUtil.dtoToEntity(dto);
				employee.setSecondaryInfo(employeeSecondaryInfo);
				employeeSecondaryInfo.setPrimary(employee);
				
				return employeeRepository.save(employee).getEmployeeId();
			}
			else
			{
				EmployeeSecondaryInfo employeeSecondaryInfo = employee.getSecondaryInfo();
				
				employeeSecondaryInfo.setPanNo(dto.getPanNo());
				employeeSecondaryInfo.setAadhaarNo(dto.getAadhaarNo());
				employeeSecondaryInfo.setFatherName(dto.getFatherName());
				employeeSecondaryInfo.setMaritalStatus(dto.getMaritalStatus());
				employeeSecondaryInfo.setMotherName(dto.getMotherName());
				employeeSecondaryInfo.setPasssportNo(dto.getPassportNo());
				employeeSecondaryInfo.setSpouceName(dto.getSpouceName());
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
				BankDetails bank = ObjectUtil.bankToEntity(dto);
				primaryInfo.setBankDetails(bank);
				bank.setPrimary(primaryInfo);
				return employeeRepository.save(primaryInfo).getEmployeeId();
			}
			else
			{
				
			BankDetails bankDetail = primaryInfo.getBankDetails();
			
			bankDetail.setAccountNo(dto.getAccountNo());
			bankDetail.setAccountNo(dto.getAccountNo());
			bankDetail.setBankId(dto.getBankId());
			bankDetail.setBankName(dto.getBankName());
			bankDetail.setBranch(dto.getBranch());
			bankDetail.setIfsc(dto.getIfsc());
			bankDetail.setState(dto.getState());
		}
		return employeeRepository.save(primaryInfo).getEmployeeId();
	}
		
		return null;
	}
	

	                           // ONE_TO_MANY
	
	
	@Override
	public String addEducation(EducationalDetailsDtoList dto) 
	{
		Optional<EmployeePrimaryInfo> optionalEducation = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalEducation.isPresent())
		{
			EmployeePrimaryInfo employee = optionalEducation.get();
			List<EducationDetails> education = ObjectUtil.educationToEntity(dto.getEducationList());
			if(employee.getEducationDetails() != null)
			{
				employee.getEducationDetails().stream().forEach(edu -> educationRepository.delete(edu));
			}
			
			education.stream().forEach(x -> x.setPrimary(employee));
			employee.setEducationDetails(education);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("Id not found");
	}


	@Override
	public String addAddressList(AddressDetailsListDto dto) 
	{
		Optional<EmployeePrimaryInfo> optionalAddress = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalAddress.isPresent())
		{
			EmployeePrimaryInfo employee = optionalAddress.get();
			List<AddressDetails> address = ObjectUtil.addressToEntity(dto.getAddressDetailList());
			if(employee.getAddressDetails()!=null)
			{
				employee.getAddressDetails().stream().forEach(addressRepository::delete);
				employee.setAddressDetails(address);
			}
			employee.setAddressDetails(address);
			address.stream().forEach(add -> add.setPrimary(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("Address not found");
	}


	@Override
	public String addExperienceList(ExperienceListDto dto) {
		
		Optional<EmployeePrimaryInfo> optionalExperience = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalExperience.isPresent())
		{
			EmployeePrimaryInfo employee = optionalExperience.get();
			List<Experience> experience = ObjectUtil.experienceToEntity(dto.getExperienceList());
			if(employee.getExperiences()!=null)
			{
				employee.getExperiences().stream().forEach(experienceRepository :: delete);
				employee.setExperiences(experience);
			}
			employee.setExperiences(experience);
			experience.stream().forEach(add -> add.setPrimary(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("error while addding experience");
	}
	
	@Override
	public String addContactList(ContactListDto dto) 
	{
		Optional<EmployeePrimaryInfo> optionalContact = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(optionalContact.isPresent())
		{
			EmployeePrimaryInfo employee = optionalContact.get();
			List<Contact> contact = ObjectUtil.contactToEntity(dto.getContactList());
			if(employee.getContacts()!=null)
			{
				employee.getContacts().stream().forEach(contactRepository :: delete);
				employee.setContacts(contact);
			}
			employee.setContacts(contact);
			contact.stream().forEach(add -> add.setPrimary(employee));
			return employeeRepository.save(employee).getEmployeeId();
		}
		throw new EmployeePrimaryException("error");
	}

	
	            // MANY_TO_MANY
	
	
	@Override
	public String addSkills(TechnicalSkillsDtoList dto) 
	{
		Optional<EmployeePrimaryInfo> employeeOptional = employeeRepository.findByEmployeeId(dto.getEmployeeId());
		if(employeeOptional.isPresent())
		{
			EmployeePrimaryInfo employee = employeeOptional.get();
			List<TechnicalSkills> skills= dto.getSkillsList().stream().map(skill ->{
				Optional<TechnicalSkills> optional= techRepository.findBySkillTypeAndSkillRatingAndYearOfExperience
						(skill.getSkillType(), skill.getSkillRating(), skill.getYearOfExperience());
				
				return optional.isPresent() ? optional.get() : ObjectUtil.dtoToSkillList(skill);
			}).collect(Collectors.toList());

			if(employee.getTechnicalSkills() != null)
			{
				employee.getTechnicalSkills().clear();
			}
			
			skills.stream().forEach(x -> {
				if(!x.getPrimaryinfoo().contains(employee))
					x.getPrimaryinfoo().add(employee);
			});
			
			employee.setTechnicalSkills(skills);
			employeeRepository.save(employee);
			return employee.getEmployeeId();
		}
		throw new EmployeePrimaryException("Employee ID not registered !!");
	}
	
	
}
	


