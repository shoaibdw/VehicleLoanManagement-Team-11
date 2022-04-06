package com.vehicleLoanManagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.vehicleLoanManagement.entity.LoanApplication;

@RepositoryRestResource(collectionResourceRel = "loanApplications", path = "loanApplications")
public interface LoanApplicationRepo extends JpaRepository<LoanApplication, String> {

	@Query("Select l FROM LoanApplication l where l.user.userId=(select u.userdetails.userId from UserRegistrationEntity u where u.email=:mail)")
	public List<LoanApplication> showAllLoanApplicationByEmail(@Param("mail") String email);

	@Query("Select l FROM LoanApplication l where l.status='Rejected' and l.user.userId=(select u.userdetails.userId from UserRegistrationEntity u where u.email =:em)")
	public List<LoanApplication> showAllRejectedLoansByEmail(@Param("em") String email);

	@Query("Select loans FROM LoanApplication loans where loans.status='Pending'")
	public List<LoanApplication> showAllPendingLoans();

	@Query("Select loans FROM LoanApplication loans where loans.status='Rejected'")
	public List<LoanApplication> showAllRejectedLoans();

	@Query("Select loans FROM LoanApplication loans where loans.status='Accepted'")
	public List<LoanApplication> showAllAcceptedLoans();

}

