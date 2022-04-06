package com.vehicleLoanManagement.Interface;

import java.util.List;
import java.util.Optional;

import com.vehicleLoanManagement.entity.LoanApplication;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface LoanApplicationInterface {
	public List<LoanApplication> showAllLoanApplicationByEmail( String email) throws RecordNotFoundException;	
	public List<LoanApplication> showRejectedLoansByEmail(String email) throws RecordNotFoundException ;
	public List<LoanApplication> modifyLoanApplicationStatus(LoanApplication loanapp) throws RecordNotFoundException;
	public Optional<List<LoanApplication>> applyLoan(LoanApplication loanapp,Long userId);
	public Optional<LoanApplication> showLoanApplicationByChassis(String chassisNo) throws RecordNotFoundException;
	public List<LoanApplication> showAllLoanApplications() throws RecordNotFoundException;
	public List<LoanApplication> getAllPendingLoans() throws RecordNotFoundException;
    public List<LoanApplication> getAllRejectedLoans() throws RecordNotFoundException;
    public List<LoanApplication> getAllAcceptedLoans() throws RecordNotFoundException;
	

}
