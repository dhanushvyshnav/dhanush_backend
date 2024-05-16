package com.excel.lms.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

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
@Entity
@Builder
@Table(name = "employee_primary_info")
public class EmployeePrimaryInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer primaryId;
	
	private String employeeId;
	private String employeeName;
	private LocalDate dateOfJoining;
	private LocalDate dateOfBirth;
	
	@Column(unique =true)
	private String email;
	private String bloodGroup;
	
	@Enumerated(EnumType.STRING)
	private String designation;
	
	@Enumerated(EnumType.STRING)
	private String gender;
	private String nationality;
	
	@Enumerated(EnumType.STRING)
	private String empoyeeStatus;


	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private EmployeeSecondaryInfo secondaryInfo;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private List<EducationDetails> educationDetails;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private List<AddressDetails> addressDetails;
	
	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private BankDetails  bankDetails;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private List<TechnicalSkills> technicalSkills;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private List<Experience> experiences;
	
	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "primary")
	private List<Contact> contacts;
}
