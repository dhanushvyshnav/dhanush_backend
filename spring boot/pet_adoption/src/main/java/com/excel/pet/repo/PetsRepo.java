package com.excel.pet.repo;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.pet.entity.Pets;

public interface PetsRepo extends JpaRepository<Pets, Integer>{
	
	Optional<Pets> findByPetId(Integer id);

}
