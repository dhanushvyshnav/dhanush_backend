package com.excel.pet.utils;


import java.util.List;
import java.util.stream.Collectors;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;
import com.excel.pet.entity.Application;
import com.excel.pet.entity.Pets;
import com.excel.pet.entity.Users;

public class ObjectUtil {
	
	private ObjectUtil() {
		
	}
	
	public static Users usersInfoDto(UsersDto dto)
	{
		return Users.builder().userId(dto.getUserId())
				.username(dto.getUsername()).email(dto.getEmail())
				.password(dto.getPassword()).createdAt(dto.getCreatedAt())
				.build();
	}
	
	public static List<Pets> petsToDto(List<PetsDto> listPets){
		return listPets.stream().map(p -> Pets.builder().petId(p.getPetId())
				.species(p.getSpecies()).breed(p.getBreed()).gender(p.getGender())
				.photoUrl(p.getPhotoUrl()).location(p.getLocation())
				.adoptionFee(p.getAdoptionFee()).isAdopted(p.getIsAdopted())
				.build()).collect(Collectors.toList());
	}
	
//	public static List<Application> applicationToDto(List<ApplicationDto> dto){
//		return dto.stream().map(a -> Application.builder().applicationId(a.getApplicationId()).applicationStatus(a.getApplicationStatus())
//				.applicationDate(a.getApplicationDate()).approvalDate(a.getApprovalDate()).build()).collect(Collectors.toList());
//	}

	public static Application applicationDtoToEntity(ApplicationDto dto) {

		return Application.builder().applicationDate(dto.getApplicationDate()).applicationStatus(dto.getApplicationStatus()).approvalDate(dto.getApprovalDate()).build();
	}

}
