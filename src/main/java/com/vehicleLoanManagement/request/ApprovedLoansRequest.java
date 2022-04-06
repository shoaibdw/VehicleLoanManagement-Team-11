package com.vehicleLoanManagement.request;

public class ApprovedLoansRequest {
	Long approvedLoansId;

	public Long getApprovedLoansId() {
		return approvedLoansId;
	}

	public void setApprovedLoansId(Long approvedLoansId) {
		this.approvedLoansId = approvedLoansId;
	}

	public ApprovedLoansRequest(Long approvedLoansId) {
		super();
		this.approvedLoansId = approvedLoansId;
	}

	public ApprovedLoansRequest() {
		super();
		// TODO Auto-generated constructor stub
	}

}
