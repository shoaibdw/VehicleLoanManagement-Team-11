package com.vehicleLoanManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@Entity
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
@Table(name="approved_loans")
public class ApprovedLoans {
	@Id
	Long approvedLoansId;

	public Long getApprovedLoansId() {
		return approvedLoansId;
	}

	public void setApprovedLoansId(Long approvedLoansId) {
		this.approvedLoansId = approvedLoansId;
	}
	
}
