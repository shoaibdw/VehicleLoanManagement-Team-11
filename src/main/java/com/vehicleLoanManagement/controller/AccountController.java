package com.vehicleLoanManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.entity.Account;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.service.AccountService;

import java.util.List;

@RequestMapping("/account")
@RestController
@CrossOrigin
public class AccountController {

	@Autowired
	AccountService accountService;
	@GetMapping(value="/hi")
    public String sayHello() {
        System.out.println("heelo........");
        return "";
    }
	 @GetMapping("/findacc")
	    public ResponseEntity<Account> findAccount( @PathVariable("email")String email) throws RecordNotFoundException{
	        Account account= accountService.getAccountByEmail(email);
	        return new ResponseEntity<Account>(account, HttpStatus.OK);
	        
	    }
//	    @PostMapping("/insert")
//	    public ResponseEntity<List<Account>> insertAccount( @RequestBody Account account) throws RecordNotFoundException{
//	        List<Account> account=accountService.AddAccount(account);
//	        return new ResponseEntity<Account>(account1, HttpStatus.OK);
//	    }
//	    
//	    @PutMapping("/update")
//	   public ResponseEntity<List<Account>> updateAccount(@PathVariable("accountNumber")@RequestBody Account account) throws RecordNotFoundException{
//	        List<Account> accounts= accountService.UpdateAccount(account);
//	        return new ResponseEntity<List<Account>>(account, HttpStatus.OK);
//	    }
}
