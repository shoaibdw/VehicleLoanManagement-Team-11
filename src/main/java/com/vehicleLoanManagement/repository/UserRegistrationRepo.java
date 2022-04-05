package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vehicleLoanManagement.entity.UserRegistration;

@Repository
public interface UserRegistrationRepo extends JpaRepository<UserRegistration , String>{

}
