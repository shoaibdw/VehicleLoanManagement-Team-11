package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.LoanApplication;
@Repository
public interface LoanApplicationRepo extends JpaRepository<LoanApplication,Long> {
	
}
