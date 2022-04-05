package com.vehicleLoanManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.repository.AdminDetailRepo;
import com.vehicleLoanManagement.request.AdminDetailRequest;

@Service
public class AdminDetailService {
	@Autowired
	AdminDetailRepo adminDetailRepo;
	public int enterDetail(AdminDetailRequest adminDetailRequest) {
		AdminDetail adminDetail= new AdminDetail();
		adminDetail.setAdminEmail(adminDetailRequest.getAdminEmail());
		adminDetail.setAdminPassword(adminDetailRequest.getAdminPassword());
		adminDetail.setAdminFullName(adminDetailRequest.getAdminFullName());
		adminDetailRepo.save(adminDetail);
		return 1;
				}

}
