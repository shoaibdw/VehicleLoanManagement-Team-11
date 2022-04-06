package com.vehicleLoanManagement.service;


import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.Interface.UserDetailInterface;
import com.vehicleLoanManagement.controller.UserDetailController;
import com.vehicleLoanManagement.entity.UserDetail;
import com.vehicleLoanManagement.entity.UserRegistration;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.UserDetailRepo;
import com.vehicleLoanManagement.repository.UserRegistrationRepo;
import com.vehicleLoanManagement.request.UserDetailRequest;

import org.springframework.stereotype.Service;


@Service
public class UserDetailService implements UserDetailInterface {
	public static Logger log = Logger.getLogger(UserDetailController.class.getName());

	@Autowired
	UserDetailRepo userDetailRepo;

	@Autowired
	UserRegistrationRepo userRegisterRepo;

	//ADDING USERDETAILS
	@Override
	public UserDetail addUserDetails(String userEmail,UserDetailRequest userDetailRequest) throws RecordNotFoundException {

	if(userDetailRequest.getUserAadharProof().isEmpty() || userDetailRequest.getUserAddressProof().isEmpty())
	{
	log.warning("WARN: UserDetails Should not be empty");
	throw new RecordNotFoundException("User details should not be null");
	}
	else if(userRegisterRepo.findById(userEmail)==null) {
	throw new RecordNotFoundException("User not registered");
	}
	Optional<UserRegistration> userRegister =userRegisterRepo.findById(userEmail);
	UserRegistration userReg=userRegister.get();

	UserDetail userDetail=new UserDetail();

	if(userReg!=null && userReg.getUserDetail()==null ) {
	userDetail.setUserCity(userDetailRequest.getUserCity());
	userDetail.setUserState(userDetailRequest.getUserState());
	userDetail.setUserCountry(userDetailRequest.getUserCountry());
	userDetail.setUserPincode(userDetailRequest.getUserPincode());
	userDetail.setUserAddressProof(userDetailRequest.getUserAddressProof());
	userDetail.setUserSalary(userDetailRequest.getUserSalary());
	userDetail.setUserAadharProof(userDetailRequest.getUserAadharProof());
	userDetail.setUserPanProof(userDetailRequest.getUserPanProof());
	userDetailRepo.save(userDetail);

	userReg.setUserDetail(userDetail);
	userRegisterRepo.save(userReg);
	}
	return userDetail;

	}



	//update user detail
	@Override
	public UserDetail editUserDetails(Long userId,UserDetailRequest userDetailRequest) throws RecordNotFoundException{

	if(userId==0) {
	log.warning("WARN: UserId Should not be empty");
	throw new RecordNotFoundException("User Not Found...");
	}
	UserDetail userDetail=new UserDetail();
	userDetail.setUserId(userId);
	userDetail.setUserCity(userDetailRequest.getUserCity());
	userDetail.setUserState(userDetailRequest.getUserState());
	userDetail.setUserCountry(userDetailRequest.getUserCountry());
	userDetail.setUserPincode(userDetailRequest.getUserPincode());
	userDetail.setUserAddressProof(userDetailRequest.getUserAddressProof());
	userDetail.setUserSalary(userDetailRequest.getUserSalary());
	userDetail.setUserAadharProof(userDetailRequest.getUserAadharProof());
	userDetail.setUserPanProof(userDetailRequest.getUserPanProof());
	userDetailRepo.save(userDetail);

	return userDetail;
	}



	//user by id
	@Override
	public UserDetail showUserDetailByUserId(Long userId) throws RecordNotFoundException{

	Optional<UserDetail>user=userDetailRepo.findById(userId);
	if(user==null) {
	log.warning("WARN: UserDetails Should not be empty");
	throw new RecordNotFoundException("No Records Found");
	}

	return user.get();
	}

	//all user
	@Override
	public List<UserDetail> showAllUserDetails() throws RecordNotFoundException{

	return userDetailRepo.findAll();
	}

}
