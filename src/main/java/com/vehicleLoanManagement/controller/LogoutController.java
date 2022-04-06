package com.vehicleLoanManagement.controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.service.LogoutService;

@RestController
@RequestMapping("/api/vehicleloans")
public class LogoutController {

    @Autowired
    private LogoutService logo;
    public static Logger logs = Logger.getLogger(UserRegistration.class.getName());
    
    

    // USED TO LOGOUT
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestBody UserRegistration userbasic) throws RecordNotFoundException{
        UserRegistration userRegis = logo.logout(userbasic);
        logs.info("Logged out succesfully");
        return new ResponseEntity("Logout Successful", HttpStatus.OK);
        
    }
 
}