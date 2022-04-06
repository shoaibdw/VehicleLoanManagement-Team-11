package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.UserDetail;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.request.UserDetailRequest;

public interface UserDetailInterface {
	public UserDetail addUserDetails(String userEmail,UserDetailRequest userDetailRequest) throws RecordNotFoundException;
	public UserDetail showUserDetailByUserId(Long userId) throws RecordNotFoundException;
	public UserDetail editUserDetails(Long userId ,UserDetailRequest userdetailRequest) throws RecordNotFoundException;
	public List<UserDetail> showAllUserDetails() throws RecordNotFoundException;
}
