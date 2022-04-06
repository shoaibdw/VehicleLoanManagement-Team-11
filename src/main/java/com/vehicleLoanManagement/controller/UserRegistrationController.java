package com.vehicleLoanManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.request.UserRegistrationRequest;
import com.vehicleLoanManagement.response.APIResponse;
import com.vehicleLoanManagement.service.UserRegistrationService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	
	//user register
	@PostMapping("/register")
	public ResponseEntity<UserRegistration> userRegister(@RequestBody UserRegistrationRequest userRegistrationRequest) throws DuplicateRecordException{
       UserRegistration userRegistration=userRegistrationService.userRegister(userRegistrationRequest);
		
		
			return new ResponseEntity<UserRegistration>(userRegistration,HttpStatus.OK);
		
	}
	//Update the user by email
	@PutMapping("/update")
	public ResponseEntity<UserRegistration> update(@RequestParam String userEmail,@RequestBody UserRegistrationRequest userRegistrationRequest) throws RecordNotFoundException{
       UserRegistration user=userRegistrationService.update(userEmail,userRegistrationRequest);
		
		
			return  new ResponseEntity<UserRegistration>(user,HttpStatus.OK);
		
	}
	
	//Get all user
	@GetMapping("/alluser")
	public List<UserRegistration> findAllUser() throws RecordNotFoundException{
		return userRegistrationService.findAllUser();
		
	}
	//Get user by email
	@GetMapping("/byemail")
	public Optional<UserRegistration> findEmail(@RequestParam String userEmail) throws RecordNotFoundException{
		return userRegistrationService.findEmail(userEmail);
	}
	

}
