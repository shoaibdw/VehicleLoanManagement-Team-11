package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.UserDetail;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface UserDetailInterface {
	 public List<UserDetail> addUserDetails(UserDetail useradvanced, String email) throws RecordNotFoundException;//userDao
	    public UserDetail showUserDetailsInformationByUserId(int userId) throws RecordNotFoundException;//userDao
	    public List<UserDetail> editUserDetails(UserDetail user) throws RecordNotFoundException;//userDao
	    public List<UserDetail> showAllUserDetails() throws RecordNotFoundException;//adminDao

}
