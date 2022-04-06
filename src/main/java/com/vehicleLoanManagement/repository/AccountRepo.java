package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long>{

<<<<<<< HEAD
	/*
	 * @Query("Select a from AccountEntity a where a.user.userId=(Select u.userdetail.userId from UserRegistration u where u.email=:email)"
	 * ) //@
	 * Query("Select account FROM AccountEntity account, ApprovedLoansEntity approved where approved.getAccount().getAccountNo()=account.getAccountNo() and approved.getLoanId()=:loanId"
	 * ) public Account getByEmail(@Param("email") String email);
	 */
=======
//@Query("Select a from AccountEntity a where a.user.userId=(Select u.userdetail.userId from UserRegistration u where u.email=:email)")
<<<<<<< HEAD
////@Query("Select account FROM AccountEntity account, ApprovedLoansEntity approved where approved.getAccount().getAccountNo()=account.getAccountNo() and approved.getLoanId()=:loanId")
//public Account getByEmail(@Param("email") String email);
=======
//@Query("Select account FROM AccountEntity account, ApprovedLoansEntity approved where approved.getAccount().getAccountNo()=account.getAccountNo() and approved.getLoanId()=:loanId")
public Account getByEmail(@Param("email") String email);
>>>>>>> b9399b86313c200e498d23e45041e274c2ea89a4
>>>>>>> a5fc8f4f28d13e1bd8950c8513ad06de1ed5c207
}
