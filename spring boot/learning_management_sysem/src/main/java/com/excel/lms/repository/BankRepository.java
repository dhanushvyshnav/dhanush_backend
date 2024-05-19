package com.excel.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.lms.entity.BankDetails;

public interface BankRepository extends JpaRepository<BankDetails, Integer> {

}
