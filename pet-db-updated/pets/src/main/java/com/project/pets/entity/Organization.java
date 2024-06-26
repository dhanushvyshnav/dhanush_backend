package com.project.pets.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
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
@Table(name = "organization")
public class Organization 
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Organization_id")
	private int id;

//	@ManyToOne
//    @JoinColumn(name = "id", referencedColumnName = "id")
//    private Users id;

	@Column(name ="name" )
	private String name;

	@Column(name ="email" )
	private String email;

	@Column(name ="contact_no" )
	private long contactNo;

	@ManyToOne(cascade = CascadeType.ALL)
	private Users userstable;
}
