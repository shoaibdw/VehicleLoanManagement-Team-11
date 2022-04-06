package com.vehicleLoanManagement.request;

public class AccountRequest {
	  private Long accountNumber;
		
		
		private Long userDetailId;


		public Long getAccountNumber() {
			return accountNumber;
		}


		public void setAccountNumber(Long accountNumber) {
			this.accountNumber = accountNumber;
		}


		public Long getUserDetailId() {
			return userDetailId;
		}


		public void setUserDetailId(Long userDetailId) {
			this.userDetailId = userDetailId;
		}


		public AccountRequest(Long accountNumber, Long userDetailId) {
			super();
			this.accountNumber = accountNumber;
			this.userDetailId = userDetailId;
		}


		public AccountRequest() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
