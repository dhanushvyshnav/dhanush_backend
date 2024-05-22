package com.excel.pet.service;

import java.util.List;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;

public interface PetService {
	
	public String addUser(UsersDto dto);
	
	public String addPet(PetsDto dto);
	
	public String addApplication(ApplicationDto dto);
	
	public List<UsersDto> getAllUsers();
	
	public List<PetsDto> getAllPets();
	
	public List<ApplicationDto> findAllPending(ApplicationDto dto);
	
	public String setApplicationStatus(ApplicationDto dto);
	
	
	

}
