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
import org.springframework.web.bind.annotation.RequestParam;
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
	public ResponseEntity<UserDetail> addUserDetails(@RequestParam String userEmail,@RequestBody UserDetailRequest userDetailRequest) throws RecordNotFoundException{
	UserDetail users=userDetailService.addUserDetails(userEmail,userDetailRequest);
	return new ResponseEntity<UserDetail>(users, HttpStatus.OK);
	}

	//update user detail
	@PutMapping("/updatedetail")
	public ResponseEntity<UserDetail> updateUser(@RequestParam Long userId ,@RequestBody UserDetailRequest userDetailRequest) throws RecordNotFoundException{
	UserDetail users= userDetailService.editUserDetails(userId,userDetailRequest);
	return new ResponseEntity<UserDetail>(users, HttpStatus.OK);
	}

	//get user by user id
	@GetMapping("/byid")
	public ResponseEntity<UserDetail> findUser(@RequestParam Long userId) throws RecordNotFoundException{
	UserDetail user= userDetailService.showUserDetailByUserId(userId);
	return new ResponseEntity<UserDetail>(user, HttpStatus.OK);
	}

	//get all user detail
	@GetMapping("/all")
	public ResponseEntity<List<UserDetail>> getAllUsers() throws RecordNotFoundException{
	List<UserDetail> users= userDetailService.showAllUserDetails();
	return new ResponseEntity<List<UserDetail>>(users, HttpStatus.OK);
	}
	

	


}
