
package com.excel.pet.controller;


import static com.excel.pet.constant.UserConstant.USER_INFO_SAVED;

import java.util.List;

import static com.excel.pet.constant.UserConstant.PETS_INFO_ADDED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;
import com.excel.pet.response.Success;
import com.excel.pet.service.PetService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
public class Controller {
	
	@Autowired
	private final PetService petService; 
	
	@PostMapping(path = "/userinfo")
	public ResponseEntity<Success<String>> postUsersInfo(@RequestBody UsersDto dto)
	{
		String user = petService.addUser(dto);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(user).message(USER_INFO_SAVED).build());
		
	}
	
	@PostMapping(path = "/petsinfo")
	public ResponseEntity<Success<String>> postPetsInfo(@RequestBody PetsDto  dto)
	{
		String user = petService.addPet(dto);		
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(user).message(PETS_INFO_ADDED).build());		
	}
	
	@PostMapping(path = "/appinfo")
	public ResponseEntity<Success<String>> postApplicationInfo(@RequestBody ApplicationDto  dto)
	{
		String user = petService.addApplication(dto);		
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
				.data(user).message(PETS_INFO_ADDED).build());		
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<UsersDto>> fetchAllUsers() {
		return ResponseEntity.ok(petService.getAllUsers()) ;
	}

	@GetMapping("/getAllPets")
	public ResponseEntity<List<PetsDto>> fetchAllPets() {
		return ResponseEntity.ok(petService.getAllPets()) ;
	}
	
	@GetMapping("/getAllStatus")
	public ResponseEntity<List<ApplicationDto>> fetchAllApp(@RequestBody ApplicationDto dto){
		List<ApplicationDto> app = petService.findAllPending(dto);
		return ResponseEntity.ok(petService.findAllPending(dto));
	}
	
	@PutMapping("/updateStatus")
	public ResponseEntity<Success<String>> updateApplicationStatus(@RequestBody ApplicationDto dto){
		String update= petService.setApplicationStatus(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Success.<String>builder()
				.data(update).message(PETS_INFO_ADDED).build());
		
		
	}
	

}


