package com.project.pets.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name = "applications")
public class Application 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name ="application_id" )
	private int id;
	
//	@ManyToOne
//    @JoinColumn(name = "user_id", referencedColumnName = "id")
//    private Users user_id;
//
//	@OneToMany
//	@JoinColumn(name ="pet_id", referencedColumnName = "id")
//	private Pets pet_id;
	
	@Column(name ="status" )
	private String status;
	
	@Column(name ="date" )
	private String application_date;
	
	@Column(name ="approval_date" )
	private String approval_date;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Users userstable;
	
//	@OneToMany(cascade = CascadeType.ALL,mappedBy = "applications")
//    private Pets pets;
	
}
