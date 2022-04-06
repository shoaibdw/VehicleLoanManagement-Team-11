package com.vehicleLoanManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vehicleLoanManagement.entity.ApprovedLoans;


@RepositoryRestResource(collectionResourceRel="approvedLoans",path="approvedLoans")
public interface ApprovedLoansRepo extends JpaRepository<ApprovedLoans,Integer> {

@Query("SELECT a FROM ApprovedLoans a WHERE a.account.accountNo = (SELECT acc.accountNo FROM AccountEntity acc WHERE acc.user.userId = (SELECT u.userdetails.userId FROM UserRegistrationEntity u WHERE u.email =:mail))") 
public List<ApprovedLoans> showAllApprovedByEmail(@Param("mail") String email);
}
