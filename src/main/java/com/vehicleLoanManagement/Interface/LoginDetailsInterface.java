package com.vehicleLoanManagement.Interface;

import java.util.List;

import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.exception.RegistrationException;

public interface LoginDetailsInterface {
	public UserRegistration authenticateUser(String userEmail,String password) throws RegistrationException, RecordNotFoundException ;
	   public List<UserRegistration> getAllUsersDetails();
	   public Admin authenticateAdmin(String adminEmail,String password) throws RegistrationException, RecordNotFoundException;
	   public List<Admin> getAllAdminDetails();

}
