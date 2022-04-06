package com.vehicleLoanManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.controller.UserDetailController;
import com.vehicleLoanManagement.entity.Account;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.AccountRepo;

import java.util.List;
import ch.qos.logback.classic.Logger;

@Service
public class AccountService {

	//public static Logger log = Logger.getLogger(UserDetailController.class.getName());
<<<<<<< HEAD
//	    @Autowired
//	    private AccountRepo accountRepo;
=======
	    //@Autowired
	    //private AccountRepo accountRepo;
>>>>>>> b9399b86313c200e498d23e45041e274c2ea89a4

	 

	    //Getting Account By Email
<<<<<<< HEAD
	 /*   @Override
	    public Account getAccountByEmail(String email) throws RecordNotFoundException{

		   return 
	    }*/
=======
//	    @Override
//	    public Account getAccountByEmail(String email) throws RecordNotFoundException{
//
//		   return 
//	    }
>>>>>>> b9399b86313c200e498d23e45041e274c2ea89a4
	    
//	    //Adding Account
//	    @Override
//	    public List<Account> AddAccount(Account account) throws RecordNotFoundException {
//	        log.info("Service Layer - Entry - addAccountDetails");
//	    //    AccountEntity accountEntity=new AccountEntity();
//	        if(account.getAccountNumber()==0) {
//	            log.warn("WARN: AccountNumber Should not be empty");
//	            throw new RecordNotFoundException("Record doesn't exist");
//	        }
//	        log.info("Service Layer - Exit - addAccountDetails");
//	        account=accountRepo.saveAndFlush(account);
//	        //return account;
//	        return accountRepo.findAll();
//	        
//	    }
//	    
//	   
//	    //Updating Account
//	    @Override
//	    public List<Account> UpdateAccount(Account account) throws RecordNotFoundException{
//	        log.info("Service Layer - Entry - UpdateAccountDetails");
//	        if(account.getAccountNumber()==0) {
//	            log.warn("WARN: AccountNumber Should not be empty");
//	            throw new RecordNotFoundException("Record doesn't exist");
//	        }
//	        log.info("Service Layer - Exit - UpdateAccountDetails");
//	        accountRepo.save(account);//save(accountNo);
//	        return  accountRepo.findAll();
//	    }
}
