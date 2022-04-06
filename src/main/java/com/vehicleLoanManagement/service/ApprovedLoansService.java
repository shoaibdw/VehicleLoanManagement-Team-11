package com.vehicleLoanManagement.service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;
import org.apache.logging.log4j.LogManager;
//import org.apache.log4j.Logger;





import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.repository.ApprovedLoansRepo;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.InvalidDetailsException;
import com.vehicleLoanManagement.exception.LoanApplicationException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.Interface.ApprovedLoansInterface;
import com.vehicleLoanManagement.entity.ApprovedLoans;

@Service
public class ApprovedLoansService 
{
    
//    static Logger log = Logger.getLogger(ApprovedLoansService.class.getClass());
//    
//    EmiService emiService;
//    
//    @Autowired
//    private ApprovedLoansRepo approvedRepo;
// 
//    
//    //GET APPROVED BY LOANID
//        @Override
//        public ApprovedLoans showApprovedByLoanId(int loanId) throws RecordNotFoundException
//        {
// 
//            log.info("Service Layer - Entry - showAllApprovedByEmail");
//            
//            Optional<ApprovedLoans> approved = approvedRepo.findById(loanId);
//            if(!approved.isPresent())
//            {
//                log.warning("WARN:  LoanId should not be match");
//                throw new RecordNotFoundException("LoanId should not be match");
//            }
//            log.info("Service Layer - Exit - showApprovedByLoanId");
//            return approved.get();    
//        }
// 
//    //GET APPROVED BY EMAIL
//    @Override
//    public List<ApprovedLoans> showAllApprovedByEmail(String email) throws RecordNotFoundException 
//    {
// 
//        log.info("Service Layer - Entry - showAllApprovedByEmail");
//        
//        if(email==null)
//        {
//            log.warning("WARN:  Email should not match");
//            throw new RecordNotFoundException("Email should not match");
//        }
//        
//        log.info("Service Layer - Exit - showAllApprovedByEmail");
//        return approvedRepo.findAll();
//    
//    }
// 
//    @Override
//    public List<ApprovedLoans> addApprovedLoan(ApprovedLoans approved) throws DuplicateRecordException, InvalidDetailsException, LoanApplicationException {
//    	if(approved==null)
//    		throw new InvalidDetailsException("Invalid Object Found!");
//    	if(!(approved.getLoanapp().getStatus().equalsIgnoreCase("Accepted")))
//    		throw new LoanApplicationException("Loan is still not approved!");                          
//    	double loanAmount=approved.getLoanapp().getAmount();   
//    	int tenure=approved.getLoanapp().getTenure();
//    	double interestRate=approved.getLoanapp().getInterest();
//    	double emi=emiService.EMICalculate(loanAmount, 12, interestRate);
//    	approved.setEmi(emi);   
//    	
//    	  Optional<ApprovedLoans> retApproved=approvedRepo.findById(approved.getLoanId());     
//    	if(retApproved.isPresent())
//    		throw new DuplicateRecordException("The Loan is already added");
//    	approvedRepo.saveAndFlush(approved);
//    	return approvedRepo.findAll();
//    	                                                                                                      
//    }
//    
//	@Override
//    public List<ApprovedLoans> showall() {
//    	// TODO Auto-generated method stub
//    	return approvedRepo.findAll();
//    }


    
}