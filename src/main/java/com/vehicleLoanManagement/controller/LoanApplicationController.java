package com.vehicleLoanManagement.controller;

import java.util.List;
import java.util.Optional;
//import java.util.logging.Logger;
//
//import javax.validation.Valid;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;

//import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.entity.LoanApplication;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.service.LoanApplicationService;




@RestController
@RequestMapping("/api/vehicleloans")
@Validated
public class LoanApplicationController {
//	@Autowired
//	private LoanApplicationService loanApplicationService;
//
//	public static Logger log = Logger.getLogger(LoanApplicationController.class.getName());
//
////Get laon applications by email
//	@GetMapping("/loanapplications/bymail/{email}")
//	public ResponseEntity<List<LoanApplication>> showLoanApplicationByEmail(
//			@PathVariable("email") @Email(message = "email not valid") @NotNull(message = "email null") String email)
//			throws RecordNotFoundException {
//		log.info("Show Loan Application by Email Start");
//		List<LoanApplication> loansApplied = loanApplicationService.showAllLoanApplicationByEmail(email);
//
//		if (loansApplied.isEmpty()) {
//			throw new RecordNotFoundException("No Loans found");
//
//		}
//		log.info("Show Loan Application by Email End");
//
//		return new ResponseEntity<List<LoanApplication>>(loansApplied, HttpStatus.OK);
//
//	}
//
////Get loan applications by chassis number
//	@GetMapping("/loanapplications/{chassisno}")
//	public ResponseEntity<Optional<LoanApplication>> showLoanApplicationByChassis(
//			@PathVariable("chassisno") @Size(min=3,max=20 ,message = "size of chassis number should be min 3 and max 20") String chassisNo)
//			throws RecordNotFoundException {
//		log.info("Show Loan Application by Chassis number start");
//		Optional<LoanApplication> loansApplied = loanApplicationService.showLoanApplicationByChassis(chassisNo);
//		if (loansApplied == null) {
//			throw new RecordNotFoundException("No Loans found");
//		}
//		log.info("Show Loan Application by Chassis number end");
//		return new ResponseEntity<Optional<LoanApplication>>(loansApplied, HttpStatus.OK);
//
//	}
//
////Get rejected loans by email
//	@GetMapping("/loanapplications/rejected/{email}")
//	public ResponseEntity<List<LoanApplication>> RejectedLoansByEmail(
//			@PathVariable("email") @Email(message = "email not valid") @NotNull(message = "email null") String email)
//			throws RecordNotFoundException {
//		log.info("Show Rejected Loan Applications by email start");
//		List<LoanApplication> loansApplied = loanApplicationService.showRejectedLoansByEmail(email);
//		if (loansApplied.isEmpty()) {
//			throw new RecordNotFoundException("No rejected Loans found");
//		}
//		log.info("Show Rejected Loan Applications by email end");
//		return new ResponseEntity<List<LoanApplication>>(loansApplied, HttpStatus.OK);}
//
////apply for a loan
//		@PostMapping("/loanapplications/{userId}")
//		public ResponseEntity<Optional<List<LoanApplication>>> applyLoan(@Valid @RequestBody LoanApplication loans,
//				@PathVariable("userId") @Min(1) int id)
//				throws DuplicateRecordException, RecordNotFoundException {
//			log.info("Apply loan start");
//			Optional<List<LoanApplication>> loansApplied = null;
//			if ((loanApplicationService.showLoanApplicationByChassis(loans.getChassisNo())).isPresent())
//				loansApplied = loanApplicationService.applyLoan(loans, id);
//			else
//				throw new DuplicateRecordException("Record already exists");
//			log.info("Apply loan end");
//			return new ResponseEntity<Optional<List<LoanApplication>>>(loansApplied, HttpStatus.OK);
//		}
////Modify loan application status
//	@PutMapping("/loanapplications")
//	public ResponseEntity<List<LoanApplication>> updateLoanApplication(@Valid @RequestBody LoanApplication loanApp)
//			throws RecordNotFoundException {
//		log.info("Update Loan Application start");
//
//		List<LoanApplication> loans = loanApplicationService.modifyLoanApplicationStatus(loanApp);
//
//		if (loans.isEmpty()) {
//			throw new RecordNotFoundException("Loan not found");
//		}
//		log.info("Update Loan Application end");
//		return new ResponseEntity<List<LoanApplication>>(loans, HttpStatus.OK);
//	}
//
//	/* controller for checking all pending loans */
//
//	@GetMapping("/loanapplications/pendingloans")
//	public ResponseEntity<List<LoanApplication>> getAllPendingLoans() throws RecordNotFoundException {
//		List<LoanApplication> loanApplications = loanApplicationService.getAllPendingLoans();
//		log.info("Show All Pending Loan Applications");
//
//		return new ResponseEntity<List<LoanApplication>>(loanApplications, HttpStatus.OK);
//	}
//
//	/* controller for checking rejected loans */
//	@GetMapping("/loanapplications/rejectedloans")
//	public ResponseEntity<List<LoanApplication>> getAllRejectedLoans() throws RecordNotFoundException {
//		List<LoanApplication> loanApplications = loanApplicationService.getAllRejectedLoans();
//		log.info("Show All Rejected Loan Applications");
//
//		return new ResponseEntity<List<LoanApplication>>(loanApplications, HttpStatus.OK);
//	}
//	/* controller for checking approved loans */
//
//	@GetMapping("/loanapplications/approvedloans")
//	public ResponseEntity<List<LoanApplication>> getAllApprovedLoans() throws RecordNotFoundException {
//
//		List<LoanApplication> loanApplications = loanApplicationService.getAllAcceptedLoans();
//		log.info("Show All Accepted Loan Applications");
//
//		return new ResponseEntity<List<LoanApplication>>(loanApplications, HttpStatus.OK);
//	}
}

