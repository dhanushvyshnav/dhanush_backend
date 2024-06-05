package com.excel.pet.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.excel.pet.entity.Users;

public interface UserRepo extends JpaRepository<Users, Integer>{
		
	Optional<Users> findByEmail(@Param("email") String email);

	//Optional<Users> findByName(String username);
	


}
