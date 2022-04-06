package com.vehicleLoanManagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.vehicleLoanManagement.Interface.LogoutInterface;
import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.UserRegistrationRepo;

public class LogoutService implements  LogoutInterface {
	  @Autowired
	    private UserRegistrationRepo userRegisterRepo;
	    // USED TO LOGOUT
	        @Override
	        public UserRegistration logout(UserRegistration userbasic)throws RecordNotFoundException {
	            // TODO Auto-generated method stub
	            Optional<UserRegistration> userbasics = userRegisterRepo.findById(userbasic.getUserEmail());
	            if (!userbasics.isPresent()) 
	            {
	                return null;
	            } else
	                return userbasics.get();
	        

}
}
