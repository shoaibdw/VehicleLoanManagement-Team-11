package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.ApprovedLoans;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.InvalidDetailsException;
import com.vehicleLoanManagement.exception.LoanApplicationException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface ApprovedLoansInterface {
	  //GET APPROVED BY EMAIL
    public List<ApprovedLoans> showAllApprovedByEmail(String email) throws RecordNotFoundException;
    
    //GET APPROVED BY LOANID
    public ApprovedLoans showApprovedByLoanId(int loanId) throws RecordNotFoundException;
    
    //Saranya
    public List<ApprovedLoans> addApprovedLoan(ApprovedLoans approved) throws RecordNotFoundException, DuplicateRecordException, InvalidDetailsException, LoanApplicationException;

	List<ApprovedLoans> showall();

}
