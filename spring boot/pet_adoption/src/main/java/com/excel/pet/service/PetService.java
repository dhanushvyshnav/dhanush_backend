package com.excel.pet.service;

import java.util.List;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;

public interface PetService {
	
	public Integer addUser(UsersDto dto);
	
	public Integer signIn(UsersDto dto);
	
	public Integer registerUser(UsersDto dto);
	
	public Integer addPet(PetsDto dto);
	
	public Integer addApplication(ApplicationDto dto);
	
	public List<UsersDto> getAllUsers();
	
	public List<PetsDto> getAllPets();
	
	public List<ApplicationDto> findAllPending(ApplicationDto dto);
	
	public Integer setApplicationStatus(ApplicationDto dto);

	
	
	
	

}
