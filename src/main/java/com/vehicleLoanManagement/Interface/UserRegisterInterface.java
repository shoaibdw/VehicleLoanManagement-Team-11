package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface UserRegisterInterface {

    // ADDING AN USER
    public UserRegistration userRegister(UserRegistration userbasic) throws DuplicateRecordException;
 
    //PASSWORD RESET
    public List<UserRegistration> passwordReset(UserRegistration userbasic)throws RecordNotFoundException;
 
    //GET USER BY EMAIL
    public UserRegistration showUserRegistrationInformationByEmail(String email)throws RecordNotFoundException;
 
    //GET ALL USERS
    public List<UserRegistration> getAllUsers()throws RecordNotFoundException;

}
