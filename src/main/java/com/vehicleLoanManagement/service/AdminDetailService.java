package com.vehicleLoanManagement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.exception.DuplicateRecordException;
import com.vehicleLoanManagement.exception.RecordNotFoundException;
import com.vehicleLoanManagement.repository.AdminDetailRepo;
import com.vehicleLoanManagement.request.AdminDetailRequest;

@Service
public class AdminDetailService {
	@Autowired
	AdminDetailRepo adminDetailRepo;
	
	//register an admin
	public AdminDetail adminRegister(AdminDetailRequest adminDetailRequest)  throws DuplicateRecordException {
		AdminDetail adminDetail= new AdminDetail();
		adminDetail.setAmdinEmail(adminDetailRequest.getAmdinEmail());
		adminDetail.setAdminPassword(adminDetailRequest.getAdminPassword());
		adminDetail.setAdminFullName(adminDetailRequest.getAdminFullName());
		adminDetailRepo.save(adminDetail);
		return adminDetail;
				}
	
	//GET ADMIN BY EMAIL
    public Optional<AdminDetail> getAdminByEmail(String amdinEmail) throws RecordNotFoundException
    {
 
    	if(amdinEmail==null) {
    		throw new RecordNotFoundException("Null email entered");
    	}
   
    	else {
        Optional<AdminDetail> admin = adminDetailRepo.findById(amdinEmail);
 
       if(admin==null)
        {
            
            throw new RecordNotFoundException("Admin Email not found");
        }
        
        return admin;
    	}
 
    }
    
  //GET ALL ADMINS
    public List<AdminDetail> getAllAdmins() throws RecordNotFoundException 
    {
            return adminDetailRepo.findAll();
            
    }
 
    //UPDATING AN ADMIN
    public AdminDetail updateAdmin(String amdinEmail,AdminDetailRequest adminDetailRequest) throws RecordNotFoundException
    {
      if(amdinEmail.isEmpty())
        {
            
            throw new RecordNotFoundException("Admin Email not found");
        }
      else {
      
        AdminDetail adminDetail= new AdminDetail();
		adminDetail.setAmdinEmail(amdinEmail);
		adminDetail.setAdminPassword(adminDetailRequest.getAdminPassword());
		adminDetail.setAdminFullName(adminDetailRequest.getAdminFullName());
		adminDetailRepo.save(adminDetail);
		return adminDetail; 
      
      }
        
    }
    

}
