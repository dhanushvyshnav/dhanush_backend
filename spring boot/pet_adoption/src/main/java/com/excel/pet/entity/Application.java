package com.excel.pet.entity;

import java.time.LocalDate;

import com.excel.pet.enums.ApplicationStatus;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Builder
@ToString
@Table(name="adoption_application")
public class Application {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Enumerated(EnumType.STRING)
	private ApplicationStatus applicationStatus;
	
	private LocalDate applicationDate;
	
	private LocalDate approvalDate;
	
	@JoinColumn(name = "userId")
	@ManyToOne(cascade =  CascadeType.ALL, fetch = FetchType.EAGER)
	private Users users;
	
	@JoinColumn(name ="petId")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Pets pets;
	

	
}
