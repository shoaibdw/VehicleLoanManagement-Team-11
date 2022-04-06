package com.vehicleLoanManagement.request;

import com.vehicleLoanManagement.entity.UserDetail;

public class LoanApplicationRequest {
	private String chassisNo ;

	private Double amount;
	private Integer tenure;
	private Double interest;
	private String status="PENDING";
	private Double existingEMI;
	private String brand;
	private String model;
	private String vehicleType;
	private String colour;
	private Double exShowPrice;
	private Double onRoadPrice;
	
	private UserDetail userDetail;

	
	public String getChassisNo() {
		return chassisNo;
	}
	public void setChassisNo(String chassisNo) {
		this.chassisNo = chassisNo;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public Integer getTenure() {
		return tenure;
	}
	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}
	public Double getInterest() {
		return interest;
	}
	public void setInterest(Double interest) {
		this.interest = interest;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Double getExistingEMI() {
		return existingEMI;
	}
	public void setExistingEMI(Double existingEMI) {
		this.existingEMI = existingEMI;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public Double getExShowPrice() {
		return exShowPrice;
	}
	public void setExShowPrice(Double exShowPrice) {
		this.exShowPrice = exShowPrice;
	}
	public Double getOnRoadPrice() {
		return onRoadPrice;
	}
	public void setOnRoadPrice(Double onRoadPrice) {
		this.onRoadPrice = onRoadPrice;
	}
	
	public UserDetail getUserDetail() {
		return userDetail;
	}
	public void setUserDetail(UserDetail userDetail) {
		this.userDetail = userDetail;
	}
	public LoanApplicationRequest(String chassisNo, Double amount, Integer tenure, Double interest, String status,
			Double existingEMI, String brand, String model, String vehicleType, String colour, Double exShowPrice,
			Double onRoadPrice) {
		super();
		this.chassisNo = chassisNo;
		this.amount = amount;
		this.tenure = tenure;
		this.interest = interest;
		this.status = status;
		this.existingEMI = existingEMI;
		this.brand = brand;
		this.model = model;
		this.vehicleType = vehicleType;
		this.colour = colour;
		this.exShowPrice = exShowPrice;
		this.onRoadPrice = onRoadPrice;
		
	}
	public LoanApplicationRequest(UserDetail userDetail) {
		super();
		this.userDetail = userDetail;
	}
	public LoanApplicationRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
