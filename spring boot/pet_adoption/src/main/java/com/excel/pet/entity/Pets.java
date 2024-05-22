package com.excel.pet.entity;

import java.util.List;

import com.excel.pet.enums.Breed;
import com.excel.pet.enums.Gender;
import com.excel.pet.enums.Species;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity@Builder
@Table(name = "pets")
public class Pets {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(unique = true)
	private String petId;
	
	@Enumerated(EnumType.STRING)
	private Species species;
	
	@Enumerated(EnumType.STRING)
	private Breed breed;
	
	@Enumerated(EnumType.STRING)
	private Gender gender;
	
	private String photoUrl;
	private String location;
	private Double adoptionFee;
	private Boolean isAdopted;
	
	@JoinColumn(name = "userId")
	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private Users users;
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "pets")
	private List<Application> applications;
}
