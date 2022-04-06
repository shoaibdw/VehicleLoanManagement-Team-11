package com.vehicleLoanManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.repository.UserRegistrationRepo;
import com.vehicleLoanManagement.request.UserRegistrationRequest;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
	public int register(UserRegistrationRequest userRegistrationRequest) {
		
		UserRegistration userRegistration=new UserRegistration();
		
		userRegistration.setUserEmail(userRegistrationRequest.getUserEmail());
		userRegistration.setUserPassword(userRegistrationRequest.getUserPassword());
		userRegistration.setUserFullName(userRegistrationRequest.getUserFullName());
		userRegistration.setUserAge(userRegistrationRequest.getUserAge());
		userRegistration.setUserGender(userRegistrationRequest.getUserGender());
		userRegistration.setUserPhoneNumber(userRegistrationRequest.getUserPhoneNumber());
		
		userRegistrationRepo.save(userRegistration);
		
		
		
		return 1;
		
	}
	
      public int update(String userEmail,UserRegistrationRequest userRegistrationRequest) {
		
		UserRegistration userRegistration=new UserRegistration();
		
		userRegistration.setUserEmail(userEmail);
		userRegistration.setUserPassword(userRegistrationRequest.getUserPassword());
		userRegistration.setUserFullName(userRegistrationRequest.getUserFullName());
		userRegistration.setUserAge(userRegistrationRequest.getUserAge());
		userRegistration.setUserGender(userRegistrationRequest.getUserGender());
		userRegistration.setUserPhoneNumber(userRegistrationRequest.getUserPhoneNumber());
		
		userRegistrationRepo.save(userRegistration);
		
		return 1;
		
	}
      
      public List<UserRegistration> findAllUser(){
    	 return userRegistrationRepo.findAll();
      }
	
      public Optional<UserRegistration> findEmail(String userEmail) {
    	  return userRegistrationRepo.findById(userEmail);
      }
	

}
