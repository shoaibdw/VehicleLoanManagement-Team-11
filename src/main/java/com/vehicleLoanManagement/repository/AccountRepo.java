package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long>{

}
