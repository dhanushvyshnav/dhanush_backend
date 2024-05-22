package com.excel.pet.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.pet.entity.Admin;

public interface AdminRepo extends JpaRepository<Admin, Integer> {

	Admin findByNameAndPassword(String name, String password);	 

}
