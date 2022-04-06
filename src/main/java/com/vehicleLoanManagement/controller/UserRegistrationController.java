package com.vehicleLoanManagement.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.vehicleLoanManagement.request.UserRegistrationRequest;
import com.vehicleLoanManagement.response.APIResponse;
import com.vehicleLoanManagement.service.UserRegistrationService;

@RestController
@CrossOrigin
@RequestMapping("/user")
public class UserRegistrationController {
	
	@Autowired
	UserRegistrationService userRegistrationService;
	
	@PostMapping("/register")
	public ResponseEntity<APIResponse> register(@RequestBody UserRegistrationRequest userRegistrationRequest){
       int i=userRegistrationService.register(userRegistrationRequest);
		
		if(i>0)
			return ResponseEntity.ok(new APIResponse("success","registration successfully done"));
		else
			return ResponseEntity.ok(new APIResponse("failed"," try again"));
		
	}
	//Update the user by email
	@PutMapping("/update")
	public ResponseEntity<APIResponse> update(@RequestParam String userEmail,@RequestBody UserRegistrationRequest userRegistrationRequest){
       int i=userRegistrationService.update(userEmail,userRegistrationRequest);
		
		if(i>0)
			return ResponseEntity.ok(new APIResponse("success","update successfully "));
		else
			return ResponseEntity.ok(new APIResponse("failed"," try again"));
		
	}
	
	//Get all user
	@GetMapping("/alluser")
	public List<UserRegistration> findAllUser(){
		return userRegistrationService.findAllUser();
		
	}
	//Get user by email
	@GetMapping("/byemail")
	public Optional<UserRegistration> findEmail(@RequestParam String userEmail) {
		return userRegistrationService.findEmail(userEmail);
	}
	

}
