package com.vehicleLoanManagement.Interface;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface LogoutInterface {
    public UserRegistration logout(UserRegistration userbasic) throws RecordNotFoundException;


}
