package com.vehicleLoanManagement.entity;

import java.time.LocalDate;

public class EmiClass {
	
	private LocalDate date;
	private String beginningBalance;
	private String emi;
	private String principal;
	private String interest;
	private String endingBalance;
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getBeginningBalance() {
		return beginningBalance;
	}
	public void setBeginningBalance(String beginningBalance) {
		this.beginningBalance = beginningBalance;
	}
	public String getEmi() {
		return emi;
	}
	public void setEmi(String emi) {
		this.emi = emi;
	}
	public String getPrincipal() {
		return principal;
	}
	public void setPrincipal(String principal) {
		this.principal = principal;
	}
	public String getInterest() {
		return interest;
	}
	public void setInterest(String interest) {
		this.interest = interest;
	}
	public String getEndingBalance() {
		return endingBalance;
	}
	public void setEndingBalance(String endingBalance) {
		this.endingBalance = endingBalance;
	}
	public EmiClass(LocalDate date, String beginningBalance, String emi, String principal, String interest,
			String endingBalance) {
		super();
		this.date = date;
		this.beginningBalance = beginningBalance;
		this.emi = emi;
		this.principal = principal;
		this.interest = interest;
		this.endingBalance = endingBalance;
	}
	public EmiClass() {
		super();
	}

}
