package com.vehicleLoanManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.repository.LoanApplicationRepo;
import com.vehicleLoanManagement.repository.UserDetailRepo;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.Interface.LoanApplicationInterface;
import com.vehicleLoanManagement.entity.LoanApplication;
import com.vehicleLoanManagement.entity.UserDetail;

@Service
public class LoanApplicationService  implements LoanApplicationInterface {

	@Autowired
	private LoanApplicationRepo loansRepo;
	@Autowired
	private UserDetailRepo userDetailRepo;

	// Get all loan applications of a user using email
	@Override
	public List<LoanApplication> showAllLoanApplicationByEmail(String email) throws RecordNotFoundException {
		// TODO Auto-generated method stub

		if (email == null) {
			throw new RecordNotFoundException("Null Email Entered");
		}
		List<LoanApplication> loansApp = loansRepo.showAllLoanApplicationByEmail(email);

		if (loansApp.isEmpty())
			throw new RecordNotFoundException("No loans applied");
		return loansApp;
	}

	// Get all Rejected loans of a user using email
	@Override
	public List<LoanApplication> showRejectedLoansByEmail(String email) throws RecordNotFoundException {
		if (email == null) {
			throw new RecordNotFoundException("Null Email Entered");
		}
		List<LoanApplication> loansApp = loansRepo.showAllRejectedLoansByEmail(email);
		if (loansApp.isEmpty())
			throw new RecordNotFoundException("No Rejected loans found");
		return loansApp;
	}

	// Modify Loan Application Status
	@Override
	public List<LoanApplication> modifyLoanApplicationStatus(LoanApplication loanApp)
			throws RecordNotFoundException {

		if (loanApp == null) {
			throw new RecordNotFoundException("Loan Application Not Found");
		} else if ((loansRepo.findById(loanApp.getChassisNo())) != null) {
			double sal = loanApp.getUserDetail().getUserSalary();

			if (loanApp.getAmount() < sal * 2
					|| (loanApp.getExistingEMI() < (loanApp.getAmount() / (loanApp.getTenure() * 12)))) {
				loanApp.setStatus("Approved");
				loansRepo.save(loanApp);
			} else {
				loanApp.setStatus("Rejected");
				loansRepo.save(loanApp);
			}
		}
		return loansRepo.findAll();

	}

	// Apply for a loan
	@Override
	public Optional<List<LoanApplication>> applyLoan(LoanApplication loanApp, Long userId) {

		if (loanApp == null) {
			return null;
		} else {
			Optional<UserDetail> user = userDetailRepo.findById(userId);
			loanApp.setUserDetail(user.get());
			if (loanApp.getStatus().equalsIgnoreCase("pending") )
				loansRepo.saveAndFlush(loanApp);
			return Optional.of(loansRepo.findAll());
		}
	}

	// Show loan application by chassis number
	@Override
	public Optional<LoanApplication> showLoanApplicationByChassis(String chassisNo)
			throws RecordNotFoundException {

		if (chassisNo == null) {
			throw new RecordNotFoundException("Null chassis number Entered");
		}
		// TODO Auto-generated method stub
		Optional<LoanApplication> loanApp = loansRepo.findById(chassisNo);
		if (loanApp == null)
			throw new RecordNotFoundException("Loan Application Not Found");

		return loanApp;
	}

	// Show all Loan Applications
	@Override
	public List<LoanApplication> showAllLoanApplications() throws RecordNotFoundException {
		// TODO Auto-generated method stub
		if (loansRepo.findAll().isEmpty())
			throw new RecordNotFoundException("No Loan Applications available");
		return loansRepo.findAll();

	}

	/* Method to show all Pending Users */
	@Override
	public List<LoanApplication> getAllPendingLoans() throws RecordNotFoundException {
		List<LoanApplication> pendingLoans = loansRepo.showAllPendingLoans();
		if (pendingLoans.isEmpty())
			throw new RecordNotFoundException("No Pending Loans");
		else
			return pendingLoans;
	}

	/* Method to show all Rejected loans */

	@Override
	public List<LoanApplication> getAllRejectedLoans() throws RecordNotFoundException {
		List<LoanApplication> rejectedLoans = loansRepo.showAllRejectedLoans();
		if (rejectedLoans.isEmpty())
			throw new RecordNotFoundException("No Rejected Loans");
		else
			return rejectedLoans;
	}

	/* Method to show all Accepted Loans */

	@Override
	public List<LoanApplication> getAllAcceptedLoans() throws RecordNotFoundException {

		List<LoanApplication> approveLoans = loansRepo.showAllAcceptedLoans();
		if (approveLoans.isEmpty())
			throw new RecordNotFoundException("No Approved Loans");
		else
			return approveLoans;
	}
}