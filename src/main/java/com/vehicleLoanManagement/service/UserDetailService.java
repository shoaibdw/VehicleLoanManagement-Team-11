package com.vehicleLoanManagement.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.repository.UserDetailRepo;


import org.springframework.stereotype.Service;


@Service
public class UserDetailService {
	@Autowired
	UserDetailRepo userDetailRepo;

}
