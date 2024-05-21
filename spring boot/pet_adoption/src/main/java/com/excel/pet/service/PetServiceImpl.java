package com.excel.pet.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.ApplicationListDto;
import com.excel.pet.dto.PetsListDto;
import com.excel.pet.dto.UsersDto;
import com.excel.pet.entity.Application;
import com.excel.pet.entity.Pets;
import com.excel.pet.entity.Users;
import com.excel.pet.repo.ApplicationRepo;
import com.excel.pet.repo.PetsRepo;
import com.excel.pet.repo.UserRepo;
import com.excel.pet.utils.ObjectUtil;

@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private UserRepo userRepo;

	@Autowired
	private PetsRepo petsRepo;
	
	@Autowired
	private ApplicationRepo applicationRepo;

	@Override
	public String addUser(UsersDto dto) {
		if(!userRepo.findByUserId(dto.getUserId()).isPresent())
		{
			Users usersInfoDto = ObjectUtil.usersInfoDto(dto);

			Users save = userRepo.save(usersInfoDto);
			return save.getUserId();
		}		
		return null;
	}

	@Override
	public String addPet(PetsListDto dto) {

		Optional<Users> byUserId = userRepo.findByUserId(dto.getUserId());
		if(byUserId.isPresent()) {
			Users users = byUserId.get();
			List<Pets> pets = ObjectUtil.petsToDto(dto.getPetsList());
			if(users.getPets()!=null) {
				users.getPets().stream().forEach(petsRepo::delete);
				users.setPets(pets);
			}
			users.setPets(pets);
			pets.stream().forEach(p -> p.setUsers(users));
			return userRepo.save(users).getUserId();
		}
		return null;
	}

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
	    return null;
	}


}
