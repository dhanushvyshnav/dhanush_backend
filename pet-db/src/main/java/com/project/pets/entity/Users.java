package com.project.pets.entity;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class Users 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;
	
	@Column(name = "username")
	private String username;
	
	@Column(name ="email" )
	private String email;
	
	@Column(name ="password" )
	private String password;
	
	@Column(name ="is_organization" )
	private Boolean is_organization;
	
	@Column(name ="created_at" )
	private String created_at;
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userstable")
	private List<Organization> organizations;	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userstable")
	private List<Pets> pets;

	@OneToMany(cascade = CascadeType.ALL,mappedBy = "userstable")
	private List<Application> applications;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "userstable")
	private List<Messages>messages;
}
