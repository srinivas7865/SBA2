package com.iiht.training.eloan.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class UserDto {
	
	@NotNull(message="customerId number is mandate")
	@NotBlank(message="customerId number is mandate")
	private Long id;
	private String firstName;
	private String lastName;
	
	@NotNull(message="email  is mandate")
	@NotBlank(message="email  is mandate")
	private String email;
	
	@NotNull(message="mobile number is mandate")
	@NotBlank(message="mobile number is mandate")
	private String mobile;
	private String role;
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
}
