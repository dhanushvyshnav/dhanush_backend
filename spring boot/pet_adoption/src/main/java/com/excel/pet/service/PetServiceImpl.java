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
import static com.excel.pet.constant.UserConstant.LOGIN_FAILED_MESSAGE;
import static com.excel.pet.constant.UserConstant.ACCOUNT_NOT_FOUND_MESSAGE;
import com.excel.pet.repo.ApplicationRepo;
import com.excel.pet.repo.PetsRepo;
import com.excel.pet.repo.UserRepo;
import com.excel.pet.utils.ObjectUtil;


@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private UserRepo userRepo;

	public PetServiceImpl(UserRepo userRepo) {
		this.userRepo = userRepo;
	}

	@Autowired
	private PetsRepo petsRepo;

	@Autowired
	private ApplicationRepo applicationRepo;

	/*Add user*/
	@Override
	public Integer addUser(UsersDto dto) {
		if(!userRepo.findById(dto.getId()).isPresent())
		{
			Users usersInfoDto = ObjectUtil.usersInfoDto(dto);
			Users save = userRepo.save(usersInfoDto);
			return save.getId();
		}
		else {
			throw new CustomException("User already exists!!");
		}

	}

	@Override
	public Integer signIn(UsersDto dto) {
		Optional<Users> email = userRepo.findByEmail(dto.getEmail());
		if(email.isPresent()) {
			Users info=email.get();
			if(info.getPassword().equals(dto.getPassword())) {
			}
			else {
				throw new CustomException(LOGIN_FAILED_MESSAGE);
			}
		}
		throw new CustomException(ACCOUNT_NOT_FOUND_MESSAGE);
	}


	/*register*/
	public static final String REGISTRATION_FAILED_MESSAGE = "Registration failed. Please try again.";
	public static final String EMAIL_ALREADY_REGISTERED_MESSAGE = "Email is already registered.";

	@Override
	public Integer registerUser(UsersDto dto) {
		// Check if the email is already registered
		if (userRepo.findByEmail(dto.getEmail()).isPresent()) {
			throw new CustomException(EMAIL_ALREADY_REGISTERED_MESSAGE);
		}

		// Create a new user entity and save it to the database
		Users newUser = new Users();
		newUser.setId(dto.getId());
		newUser.setUsername(dto.getUsername());
		newUser.setEmail(dto.getEmail());
		newUser.setPassword(dto.getPassword());

		try {
			userRepo.save(newUser);
		} catch (Exception e) {
			throw new CustomException(REGISTRATION_FAILED_MESSAGE);
		}
		return null;
	}

	/*Add Pet*/
	 //	@Override
	//	public String addPet(PetsDto dto) {
	//
	//		Optional<Users> byUserId = userRepo.findByUserId(dto.getUserId());
	//		if(byUserId.isPresent()) {
	//			Users users = byUserId.get();
	//			Pets pet = ObjectUtil.petsToDto(dto);
	//			if(users.getPets()!=null) {
	//				users.getPets().add(pet);
	//				pet.setUsers(users);
	//			}
	//			return userRepo.save(users).getUserId();
	//		}
	//		else {
	//			throw new CustomException("Please give Unique Id for Pet");
	//		}
	//
	//	}
	/*Add*/
	public Integer addPet(PetsDto dto) {
	    Optional<Users> byUserId = userRepo.findById(dto.getPetId());
	    if (byUserId.isPresent()) {
	        Users users = byUserId.get();
	        Pets pet = ObjectUtil.petsToDto(dto);
	        if (users.getPets() != null) {
	            users.getPets().add(pet);
	            pet.setUsers(users);
	        }
	        userRepo.save(users);
	        return users.getId(); // Assuming getId() returns an Integer
	    } else {
	        throw new CustomException("Please give Unique Id for Pet");
	    }
	}





	/*Applying  for Adoption */
	@Override
	public Integer addApplication(ApplicationDto dto) {
		Optional<Users> byUserId = userRepo.findById(dto.getUser_id());
		Optional<Pets> byPetId = petsRepo.findByPetId(dto.getId());
		if(byUserId.isPresent() && byPetId.isPresent()) {
			Users user = byUserId.get();
			Pets pets = byPetId.get();
			Application application = ObjectUtil.applicationDtoToEntity(dto);
			application.setPets(pets);
			application.setUsers(user);
			user.getApplications().add(application);
			pets.getApplications().add(application);
			userRepo.save(user);

			return user.getId();
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
		Optional<Users> id=userRepo.findById(dto.getUser_id());
		Optional<Pets> petId=petsRepo.findByPetId(dto.getId());
		if(applicationStatus.isPresent() && id.isPresent() && petId.isPresent()) {
			//			Users user=id.get();
			//			Pets pet = petId.get();
			//			Application application = applicationStatus.get();
			return applicationRepo.findAll().stream().map(e-> ApplicationDto.builder().user_id(dto.getUser_id()).id(dto.getId())
					.applicationDate(dto.getApplicationDate()).applicationStatus(dto.getApplicationStatus()).approvalDate(dto.getApprovalDate())
					.build()).collect(Collectors.toList());
		}
		else {
			throw new CustomException("Something Went Wrong..!");
		}
	}

	@Override
	public Integer setApplicationStatus(ApplicationDto dto) {


		Optional<Application> byId = applicationRepo.findById(dto.getId());			
		if(byId.isPresent()) {

			Application application = byId.get();

			application.setApplicationStatus(dto.getApplicationStatus());

			applicationRepo.save(application);
		}
		else {
			throw new CustomException(UserConstant.UPDATE_SUCCESSFULLY);
		}
		return null;
	}







}









