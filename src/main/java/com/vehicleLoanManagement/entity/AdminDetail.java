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
@Table(name="admin_detail")
public class AdminDetail {

	@Id
	private String amdinEmail;
	private String adminFullName;
	private String adminPassword;
	public String getAmdinEmail() {
		return amdinEmail;
	}
	public void setAmdinEmail(String amdinEmail) {
		this.amdinEmail = amdinEmail;
	}
	public String getAdminFullName() {
		return adminFullName;
	}
	public void setAdminFullName(String adminFullName) {
		this.adminFullName = adminFullName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public AdminDetail(String amdinEmail, String adminFullName, String adminPassword) {
		super();
		this.amdinEmail = amdinEmail;
		this.adminFullName = adminFullName;
		this.adminPassword = adminPassword;
	}
	public AdminDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
