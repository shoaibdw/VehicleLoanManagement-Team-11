package com.vehicleLoanManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.UserRegistrationRepo;
import com.vehicleLoanManagement.request.UserRegistrationRequest;

@Service
public class UserRegistrationService {
	
	@Autowired
	UserRegistrationRepo userRegistrationRepo;
	
	//user register
	public UserRegistration userRegister(UserRegistrationRequest userRegistrationRequest) throws DuplicateRecordException{
		
		UserRegistration userRegistration=new UserRegistration();
		
		userRegistration.setUserEmail(userRegistrationRequest.getUserEmail());
		userRegistration.setUserPassword(userRegistrationRequest.getUserPassword());
		userRegistration.setUserFullName(userRegistrationRequest.getUserFullName());
		userRegistration.setUserAge(userRegistrationRequest.getUserAge());
		userRegistration.setUserGender(userRegistrationRequest.getUserGender());
		userRegistration.setUserPhoneNumber(userRegistrationRequest.getUserPhoneNumber());
		
		userRegistrationRepo.save(userRegistration);
		
		
		
		return userRegistration;
		
	}
	
	//update user
      public UserRegistration update(String userEmail,UserRegistrationRequest userRegistrationRequest) throws RecordNotFoundException{
		
    	  if(userEmail.isEmpty())
          {
              
              throw new RecordNotFoundException("user Email not found");
          }
      else {
		UserRegistration userRegistration=new UserRegistration();
		
		userRegistration.setUserEmail(userEmail);
		userRegistration.setUserPassword(userRegistrationRequest.getUserPassword());
		userRegistration.setUserFullName(userRegistrationRequest.getUserFullName());
		userRegistration.setUserAge(userRegistrationRequest.getUserAge());
		userRegistration.setUserGender(userRegistrationRequest.getUserGender());
		userRegistration.setUserPhoneNumber(userRegistrationRequest.getUserPhoneNumber());
		
		userRegistrationRepo.save(userRegistration);
		
		return userRegistration;
      }
		
	}
      //get all user
      public List<UserRegistration> findAllUser() throws RecordNotFoundException{
    	 return userRegistrationRepo.findAll();
      }
      
	//user by email
      public Optional<UserRegistration> findEmail(String userEmail) throws RecordNotFoundException{
    	  
    	  if(userEmail==null)
    		  throw new RecordNotFoundException("NullEmail entered");
    	  return userRegistrationRepo.findById(userEmail);
      }
	

}
