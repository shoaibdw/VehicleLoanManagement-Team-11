package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.Account;

@Repository
public interface AccountRepo extends JpaRepository<Account,Long>{
	//@Query("Select a from AccountEntity a where a.user.userId=(Select u.userdetails.userId from UserRegistrationEntity u where u.email=:email)")

	 public Account getByEmail(@Param("email") String email);
}
