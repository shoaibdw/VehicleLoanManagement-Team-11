package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.AdminDetail;
@Repository
public interface AdminDetailRepo extends JpaRepository<AdminDetail,String>{

}
