package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.UserDetail;

@Repository
public interface UserDetailRepo extends JpaRepository <UserDetail, Long> {

}
