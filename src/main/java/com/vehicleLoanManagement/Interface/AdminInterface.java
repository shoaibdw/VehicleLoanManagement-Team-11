package com.vehicleLoanManagement.Interface;

import java.util.List;

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.exception.RecordNotFoundException;

public interface AdminInterface {
    //ADDING AN ADMIN
    public AdminDetail adminRegister(AdminDetail admin) throws RecordNotFoundException;            
    
    //GET ADMIN BY EMAIL
    public AdminDetail showAdminDetailsByEmail(String email) throws RecordNotFoundException;        
    
    //UPDATING AN ADMIN
    public List<AdminDetail> updateAdmin(AdminDetail admin) throws RecordNotFoundException;    
        
    //GET ALL ADMINS
    public List<AdminDetail> getAllAdmins() throws RecordNotFoundException;

    AdminDetail logout(AdminDetail admin) throws RecordNotFoundException;  

}
