package com.excel.pet.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class UsersDto {

	private String userId;
	private String username;
	private String email;
	private String password;
	private LocalDate createdAt;
}
