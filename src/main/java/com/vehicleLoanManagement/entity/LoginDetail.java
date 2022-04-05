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
@Table(name="login_detail")
public class LoginDetail {
	
	@Id
	 private String email;
	private String password;
	private String loginType;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public LoginDetail(String email, String password, String loginType) {
		super();
		this.email = email;
		this.password = password;
		this.loginType = loginType;
	}
	public LoginDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
