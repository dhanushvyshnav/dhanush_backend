package com.excel.pet.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.pet.constant.UserConstant;
import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;
import com.excel.pet.entity.Application;
import com.excel.pet.entity.Pets;
import com.excel.pet.entity.Users;
import com.excel.pet.exception.CustomException;
import com.excel.pet.repo.ApplicationRepo;
import com.excel.pet.repo.PetsRepo;
import com.excel.pet.repo.UserRepo;
import com.excel.pet.utils.ObjectUtil;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@ToString
@Slf4j
@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PetsRepo petsRepo;

	@Autowired
	private ApplicationRepo applicationRepo;

	/*Add user*/
	@Override
	public String addUser(UsersDto dto) {
		if(!userRepo.findByUserId(dto.getUserId()).isPresent())
		{
			Users usersInfoDto = ObjectUtil.usersInfoDto(dto);
			Users save = userRepo.save(usersInfoDto);
			return save.getUserId();
		}
		else {
			throw new CustomException("User already exists!!");
		}

	}

	/*Add Pet*/
	@Override
	public String addPet(PetsDto dto) {

		Optional<Users> byUserId = userRepo.findByUserId(dto.getUserId());
		if(byUserId.isPresent()) {
			Users users = byUserId.get();
			Pets pet = ObjectUtil.petsToDto(dto);
			if(users.getPets()!=null) {
				users.getPets().add(pet);
				pet.setUsers(users);
			}
			return userRepo.save(users).getUserId();
		}
		else {
			throw new CustomException("Please give Unique Id for Pet");
		}
		
	}

	/*Applying  for Adoption */
	@Override
	public String addApplication(ApplicationDto dto) {
		Optional<Users> byUserId = userRepo.findByUserId(dto.getUserId());
		Optional<Pets> byPetId = petsRepo.findByPetId(dto.getPetId());
		if(byUserId.isPresent() && byPetId.isPresent()) {
			Users user = byUserId.get();
			Pets pets = byPetId.get();
			Application application = ObjectUtil.applicationDtoToEntity(dto);
			application.setPets(pets);
			application.setUsers(user);
			user.getApplications().add(application);
			pets.getApplications().add(application);
			userRepo.save(user);

			return user.getUserId();
		}
		else {
			throw new CustomException("Application Applied Successfully");
		}
	}

	@Override
	public List<UsersDto> getAllUsers() {
		return userRepo.findAll().stream()
				.map(ObjectUtil::entityToDto).collect(Collectors.toList());

	}

	@Override
	public List<PetsDto> getAllPets() {
		return petsRepo.findAll().stream().map(ObjectUtil :: petsEntityToDto)
				.collect(Collectors.toList());
	}

	@Override
	public List<ApplicationDto> findAllPending(ApplicationDto dto) {
		Optional<Application> applicationStatus = applicationRepo.findAllByApplicationStatus(dto.getApplicationStatus());
		Optional<Users> id=userRepo.findByUserId(dto.getUserId());
		Optional<Pets> petId=petsRepo.findByPetId(dto.getPetId());
		if(applicationStatus.isPresent() && id.isPresent() && petId.isPresent()) {
			//			Users user=id.get();
			//			Pets pet = petId.get();
			//			Application application = applicationStatus.get();
			return applicationRepo.findAll().stream().map(e-> ApplicationDto.builder().userId(dto.getUserId()).petId(dto.getPetId())
					.id(e.getId()).applicationDate(e.getApplicationDate()).applicationStatus(e.getApplicationStatus())
					.approvalDate(e.getApprovalDate()).build()).collect(Collectors.toList());
		}
		else {
			throw new CustomException("Something Went Wrong..!");
		}
	}

	@Override
	public String setApplicationStatus(ApplicationDto dto) {


		Optional<Application> byId = applicationRepo.findById(dto.getId());			
		if(byId.isPresent()) {

			Application application = byId.get();

			application.setApplicationStatus(dto.getApplicationStatus());


			applicationRepo.save(application);
			//				log.info(applicationRepo.toString());				
		}
		else {
			throw new CustomException(UserConstant.UPDATE_SUCCESSFULLY);
		}
		return null;
	}


}









