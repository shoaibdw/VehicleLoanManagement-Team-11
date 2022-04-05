package com.vehicleLoanManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Entity
@Table(name="user_registration")
public class UserRegistration {
	
	@Id
	private String userEmail;
	private String userPassword;
	private String userFullName;
	private String userGender;
	private int userAge;
	private String userPhoneNumber;
	
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserPassword() {
		return userPassword;
	}
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String getUserFullName() {
		return userFullName;
	}
	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserPhoneNumber() {
		return userPhoneNumber;
	}
	public void setUserPhoneNumber(String userPhoneNumber) {
		this.userPhoneNumber = userPhoneNumber;
	}
	public UserRegistration(String userEmail, String userPassword, String userFullName, String userGender, int userAge,
			String userPhoneNumber) {
		super();
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.userFullName = userFullName;
		this.userGender = userGender;
		this.userAge = userAge;
		this.userPhoneNumber = userPhoneNumber;
	}
	
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
}

