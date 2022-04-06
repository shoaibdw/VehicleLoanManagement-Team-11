package com.vehicleLoanManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.InvalidDetailsException;
import com.vehicleLoanManagement.exception.LoanApplicationException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.entity.ApprovedLoans;
import com.vehicleLoanManagement.service.ApprovedLoansService;
 

@RestController
@RequestMapping("/api/vehicleloans")
public class ApprovedLoansController 
{
 
    
//    @Autowired
//    private ApprovedLoansService approvedLoansService;
//    
//    //GET APPROVED DETAILS BY EMAIL
//    @GetMapping("/approvedloans/{email}")  
//    public ResponseEntity<List<ApprovedLoans>> showAllApprovedByEmail(@PathVariable("email") String email) throws RecordNotFoundException
//    {
//        
//        List<ApprovedLoans> approvedLoans = approvedLoansService.showAllApprovedByEmail(email);
//        return new ResponseEntity<List<ApprovedLoans>>(approvedLoans, HttpStatus.OK);
//        
//    }
//    
//    //SHOW APPROVED DETAILS BY LOANID
//    @GetMapping("/approvedloans/{​​​​​​​aId}​​​​​​​")
//    public ResponseEntity<ApprovedLoans> showApprovedByLoanId(@PathVariable("aId") int loanId) throws RecordNotFoundException
//    {
//        
//        ApprovedLoans approvedLoans = approvedLoansService.showApprovedByLoanId(loanId);
//        return new ResponseEntity<ApprovedLoans>(approvedLoans, HttpStatus.OK);
//    
//    }
//    
//	 
//	 /* controller for adding approved loans */
//	
//		@PostMapping("/approvedloans")
//		public ResponseEntity<List<ApprovedLoans>> addApprovedLoan(
//				@RequestBody ApprovedLoans approved) throws DuplicateRecordException, InvalidDetailsException, LoanApplicationException{
//			List<ApprovedLoans> approvedLoans= approvedLoansService.addApprovedLoan(approved);
//			//log.info("Adding Approved Loans");
//			return new ResponseEntity<List<ApprovedLoans>>(approvedLoans, HttpStatus.OK);
//		}
//		
//		@GetMapping("/loans")
//		public ResponseEntity<List<ApprovedLoans>> getAllProducts(){ 
//			List<ApprovedLoans> approvedLoans= approvedLoansService.showall();
//			return new ResponseEntity<List<ApprovedLoans>>(approvedLoans, HttpStatus.OK);
//		}
	 	
 
}