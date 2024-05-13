package com.exel.spring.autowire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


public class Employee 
{

	@Autowired
	@Qualifier("address1")
	private Address address;
	
	public Employee(Address address) {
		this.address = address;
	}
	public Employee() {
	}


	@Override
	public String toString() {
		return "Employee [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}






}
