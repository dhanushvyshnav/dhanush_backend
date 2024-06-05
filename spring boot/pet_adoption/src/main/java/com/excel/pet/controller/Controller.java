
package com.excel.pet.controller;


import static com.excel.pet.constant.UserConstant.USER_INFO_SAVED;
import static com.excel.pet.constant.UserConstant.LOGIN_SUCCESSFUL;
import static com.excel.pet.constant.UserConstant.ADMIN_LOGIN_SUCCESS;

import java.util.List;
import java.util.Optional;

import static com.excel.pet.constant.UserConstant.PETS_INFO_ADDED;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.excel.pet.dto.AdminDto;
import com.excel.pet.dto.ApplicationDto;
import com.excel.pet.dto.PetsDto;
import com.excel.pet.dto.UsersDto;
import com.excel.pet.entity.Admin;
import com.excel.pet.exception.CustomException;
import com.excel.pet.repo.AdminRepo;
import com.excel.pet.response.Success;
import com.excel.pet.service.PetService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@CrossOrigin(origins="*")
public class Controller {
	
	@Autowired
	private final PetService petService;
	
	@Autowired
	private final AdminRepo  adminRepo;
	
	
	@PostMapping("/admin-login")
    public ResponseEntity<Success<Integer>> adminLogin(@RequestBody AdminDto dto) {
        try {
            Integer result = petService.adminLogin(dto);
            return ResponseEntity.ok(Success.<Integer>builder()
                    .data(result)
                    .isError(false)
                    .message("Admin login successful")
                    .build());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body(Success.<Integer>builder()
                            .isError(true)
                            .message("Admin login failed: " + e.getMessage())
                            .build());
        }
    }

	
	@PostMapping(path = "/user")
	public ResponseEntity<Success<Integer>> postUsersInfo(@RequestBody UsersDto dto){
		Integer user = petService.addUser(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(Success.<Integer>builder()
				.data(user).message(USER_INFO_SAVED).build());
	}
	

    @PostMapping("/register")
    public ResponseEntity<Success<Integer>> registerUser(@RequestBody UsersDto dto) {
        Integer result = petService.registerUser(dto);
        return ResponseEntity.status(HttpStatus.OK).body(Success.<Integer>builder()
				.data(result).isError(false).message(USER_INFO_SAVED).build());
    }
	
	@PostMapping("/signin")
	@CrossOrigin(origins="*")
	 public ResponseEntity<Success<Integer>> signIn(@RequestBody UsersDto dto){
		
		Integer signIn = petService.signIn(dto);
		return ResponseEntity.status(HttpStatus.OK).body(Success.<Integer>builder()
				.data(signIn).isError(false).message("Login Successfully!!").build());		
	}
	
//    @PostMapping(path = "/addPet")
//    public ResponseEntity<Success<Integer>> postPetsInfo(@RequestBody PetsDto dto) {
//        Integer petId = petService.addPet(dto);
//        return ResponseEntity.status(HttpStatus.CREATED).body(Success.<Integer>builder()
//                .data(petId).message("Pet added successfully").build());
//    }

	 @PostMapping(path = "/addPet")
	    public ResponseEntity<Success<Integer>> postPetsInfo(@RequestBody PetsDto dto) {
	        Integer userId = petService.addPet(dto); 
	        return ResponseEntity.status(HttpStatus.CREATED).body(Success.<Integer>builder()
	                .data(userId).message(PETS_INFO_ADDED).build());        
	    }
	      
	
	 
	 
//    @PostMapping(path = "/application-info")
//    public ResponseEntity<Success<String>> postApplicationInfo(@RequestBody ApplicationDto dto) {
//        try {
//            Integer userId = petService.addApplication(dto);
//            return ResponseEntity.status(HttpStatus.CREATED).body(Success.<String>builder()
//                    .data(userId).message(PETS_INFO_ADDED).build());
//        } catch (Exception e) {
//            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(Success.<String>builder()
//                    .isError(true).message("Internal server error").build());
//        }
//    }
//	
	 
	 @PostMapping(path = "/application-info")
	 public ResponseEntity<Success<String>> postApplicationInfo(@RequestBody ApplicationDto dto){
		 String applicationId = petService.addApplication(dto);
		 return ResponseEntity.status(HttpStatus.OK).body(Success.<String>builder().data(applicationId)
				 .message(PETS_INFO_ADDED).build());
	 }
	 
	 
	 
	@GetMapping("/getAll")
	public ResponseEntity<List<UsersDto>> fetchAllUsers() {
		return ResponseEntity.ok(petService.getAllUsers()) ;
	}

	@GetMapping("/getAllPets")
	public ResponseEntity<List<PetsDto>> fetchAllPets() {
		return ResponseEntity.ok(petService.getAllPets()) ;
	}
	
//	@GetMapping("/getAllStatus")
//	public ResponseEntity<List<ApplicationDto>> fetchAllApp(@RequestBody ApplicationDto dto){
//		List<ApplicationDto> app = petService.findAllPending(dto);
//		return ResponseEntity.ok(petService.findAllPending(dto));
//	}
	
	@GetMapping("/getAllApplications")
    public ResponseEntity<List<ApplicationDto>> getAllApplications() {
        List<ApplicationDto> applications = petService.findAllApplications();
        return ResponseEntity.ok(applications);
    }

	
	@PutMapping("/updateStatus")
	public ResponseEntity<String> updateStatus(@RequestBody ApplicationDto dto) {
	    try {
	        Integer result = petService.setApplicationStatus(dto);
	        if (result == 1) {
	            return ResponseEntity.ok("Status updated successfully");
	        } else {
	            return ResponseEntity.status(404).body("Application not found");
	        }
	    } catch (CustomException e) {
	        return ResponseEntity.status(500).body(e.getMessage());
	    }
	}

	@PutMapping("/reverseStatus")
	public ResponseEntity<String> reverseStatus(@RequestBody ApplicationDto dto) {
	    try {
	        Integer result = petService.reverseApplication(dto);
	        if (result == 1) {
	            return ResponseEntity.ok("Status updated successfully");
	        } else {
	            return ResponseEntity.status(404).body("Application not found");
	        }
	    } catch (CustomException e) {
	        return ResponseEntity.status(500).body(e.getMessage());
	    }
	}

}


