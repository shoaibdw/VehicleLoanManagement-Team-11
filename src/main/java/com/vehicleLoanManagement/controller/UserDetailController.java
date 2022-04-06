package com.vehicleLoanManagement.controller;

import java.util.List;

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

import com.vehicleLoanManagement.entity.UserDetail;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.request.UserDetailRequest;
import com.vehicleLoanManagement.service.UserDetailService;

@RestController
@CrossOrigin
@RequestMapping("/userdetail")
public class UserDetailController {
	
	@Autowired
	UserDetailService userDetailService;
	
	//add user detail
	@PostMapping("/add")
    public ResponseEntity<List<UserDetail>> addUserDetails(@RequestBody UserDetailRequest userDetailRequest) throws RecordNotFoundException{
       List<UserDetail> users=userDetailService.addUserDetails(userDetailRequest);
        return new ResponseEntity<List<UserDetail>>(users, HttpStatus.OK);
	}
	
/*	//update user detail
	@PutMapping("/usersdetails/{user_id}")
    public ResponseEntity<List<UserDetailsEntity>> updateUser(@PathVariable("user_id") @RequestBody UserDetailsRequest user) throws RecordNotFoundException{
        List<UserDetailsEntity> users= Service.editUserDetails(user);
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }
	
	//get user by user id
	@GetMapping("/userdetails/{user_id}")
	public ResponseEntity<UserDetailsEntity> findUser(@PathVariable("user_id")Integer userId) throws RecordNotFoundException{
		UserDetailsEntity user= Service.showUserDetailsInformationByUserId(userId);
		return new ResponseEntity<UserDetailsEntity>(user, HttpStatus.OK);
	}
	
	//get all user detail
	@GetMapping("/userdetails")
    public ResponseEntity<List<UserDetailsEntity>> getAllUsers() throws RecordNotFoundException{
		List<UserDetailsEntity> users= Service.showAllUserDetails();
        return new ResponseEntity<List<UserDetailsEntity>>(users, HttpStatus.OK);
    }*/

}
