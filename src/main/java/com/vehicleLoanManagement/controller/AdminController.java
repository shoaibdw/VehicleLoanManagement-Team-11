package com.vehicleLoanManagement.controller;

import java.util.List;
import java.util.Optional;

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

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.request.AdminDetailRequest;
import com.vehicleLoanManagement.response.APIResponse;
import com.vehicleLoanManagement.service.AdminDetailService;
@RequestMapping("/admin")
@RestController
@CrossOrigin
public class AdminController {
	@Autowired
	AdminDetailService adminDetailService;
	
	//register an admin
	@PostMapping("/adminregister")
	public ResponseEntity<AdminDetail> adminRegister (@RequestBody AdminDetailRequest adminDetailRequest) throws DuplicateRecordException{
		AdminDetail admin = adminDetailService.adminRegister(adminDetailRequest);
        return  new ResponseEntity<AdminDetail>(admin, HttpStatus.OK);
 
	}
	

	//GET ADMIN BY EMAIL
    @GetMapping("/byemail")
    public Optional<AdminDetail> getAdminByEmail(@RequestParam String amdinEmail) throws RecordNotFoundException {
        
        return adminDetailService.getAdminByEmail(amdinEmail);
        
        
 }
    
    //UPDATING AN ADMIN
    @PutMapping("/update")
    public ResponseEntity<AdminDetail> updateAdmin(@RequestParam String amdinEmail,@RequestBody AdminDetailRequest adminDetailRequest) throws RecordNotFoundException
    {
        
        AdminDetail admin = adminDetailService.updateAdmin(amdinEmail,adminDetailRequest);
        return new ResponseEntity<AdminDetail>(admin, HttpStatus.OK);
        
    }
    
    //GET ALL ADMINS
    @GetMapping("/alladmin")
    public List<AdminDetail> getAllAdmins() throws RecordNotFoundException{
        
       return adminDetailService.getAllAdmins();
 
    }
	
	
	
	
}