package com.vehicleLoanManagement.service;

import java.util.Optional;
import java.util.logging.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.Interface.AccountInterface;
import com.vehicleLoanManagement.controller.UserDetailController;
import com.vehicleLoanManagement.entity.Account;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.AccountRepo;
import com.vehicleLoanManagement.repository.UserRegistrationRepo;
import com.vehicleLoanManagement.response.APIResponse;

import java.util.List;
//import ch.qos.logback.classic.Logger;

@Service
public class AccountService  {
	   public static Logger log = Logger.getLogger(UserDetailController.class.getName());
	    @Autowired
	    private AccountRepo accountRepo;
	    
	    @Autowired
	    UserRegistrationRepo userRepo;

	 

	    //Getting Account By Email
	    
	    public ResponseEntity<APIResponse> getAccountByEmail(String email) {

//	 userRepo.findByEmail(email);
//
//	        log.info("Service Layer - Entry - AccountDetails");
//	        Optional<Account> account=Optional.of(accountRepo.getByEmail(email));
//	        if(!account.isPresent()) {
//	            log.warning("WARN: Account Should not be empty");
//	            throw new RecordNotFoundException("Record doesn't exist");
//	        }
//	        log.info("Service Layer - Exit - AccountDetails");
	        return ResponseEntity.ok(new APIResponse("Success", "", userRepo.findByEmail(email)));
	    }
	    
	    //Adding Account
	    @Override
	    public List<Account> AddAccount(Account account) throws RecordNotFoundException {
	        log.info("Service Layer - Entry - addAccountDetails");
	    //    Account Account=new Account();
	        if(account.getAccountNumber()==0) {
	            log.warning("WARN: AccountNumber Should not be empty");
	            throw new RecordNotFoundException("Record doesn't exist");
	        }
	        log.info("Service Layer - Exit - addAccountDetails");
	        account=accountRepo.saveAndFlush(account);
	        //return account;
	        return accountRepo.findAll();
	        
	    }
	    //Updating Account
	    @Override
	    public List<Account> UpdateAccount(Account account) throws RecordNotFoundException{
	        log.info("Service Layer - Entry - UpdateAccountDetails");
	        if(account.getAccountNumber()==0) {
	            log.warning("WARN: AccountNumber Should not be empty");
	            throw new RecordNotFoundException("Record doesn't exist");
	        }
	        log.info("Service Layer - Exit - UpdateAccountDetails");
	        accountRepo.save(account);//save(accountNo);
	        return  accountRepo.findAll();
	   


}
}
	    
