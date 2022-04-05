package com.vehicleLoanManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.request.AdminDetailRequest;
import com.vehicleLoanManagement.service.AdminDetailService;
@RequestMapping("/admin")
@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	AdminDetailService adminDetailService;
	@PostMapping("/detail")
	public String enterDetail (@RequestBody AdminDetailRequest adminDetailRequest) {
		adminDetailService.enterDetail(adminDetailRequest);
		return "successfull";
	
		
	}
	
	
	
	
}