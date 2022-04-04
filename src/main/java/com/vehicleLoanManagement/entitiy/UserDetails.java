package com.vehicleLoanManagement.entitiy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)


@Entity
@Table(name="user_detail")
public class UserDetails {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int userId;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	private String userState;
	private String userCountry;
	private Long userPincode;
	private Long userSalary;
	private String userAadharProof;
	private String userPanProof;
	private String userAddressProof;
	private String userCity;
	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public String getUserCity() {
		return userCity;
	}
	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	public Long getUserPincode() {
		return userPincode;
	}
	public void setUserPincode(Long userPincode) {
		this.userPincode = userPincode;
	}
	public Long getUserSalary() {
		return userSalary;
	}
	public void setUserSalary(Long userSalary) {
		this.userSalary = userSalary;
	}
	public String getUserAadharProof() {
		return userAadharProof;
	}
	public void setUserAadharProof(String userAadharProof) {
		this.userAadharProof = userAadharProof;
	}
	public String getUserPanProof() {
		return userPanProof;
	}
	public void setUserPanProof(String userPanProof) {
		this.userPanProof = userPanProof;
	}
	public String getUserAddressProof() {
		return userAddressProof;
	}
	public void setUserAddressProof(String userAddressProof) {
		this.userAddressProof = userAddressProof;
	}
	public UserDetails(String userState, String userCountry, Long userPincode, Long userSalary, String userAadharProof,
			String userPanProof, String userAddressProof, String userCity) {
		super();
		this.userState = userState;
		this.userCountry = userCountry;
		this.userPincode = userPincode;
		this.userSalary = userSalary;
		this.userAadharProof = userAadharProof;
		this.userPanProof = userPanProof;
		this.userAddressProof = userAddressProof;
		this.userCity = userCity;
	}
	public UserDetails(int userId) {
		super();
		this.userId = userId;
	}
	
	
	

}