package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.ApprovedLoans;

@Repository
public interface ApprovedLoansRepo extends JpaRepository <ApprovedLoans,Long>{
	
}