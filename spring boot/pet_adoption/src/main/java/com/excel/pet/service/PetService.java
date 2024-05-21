package com.excel.pet.service;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.ApplicationListDto;
import com.excel.pet.dto.PetsListDto;
import com.excel.pet.dto.UsersDto;

public interface PetService {
	
	public String addUser(UsersDto dto);
	
	public String addPet(PetsListDto dto);
	
	public String addApplication(ApplicationDto dto);
	

}
