package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import com.vehicleLoanManagement.entity.UserRegistration;

@RepositoryRestResource(collectionResourceRel="users",path="users")
public interface UserRegistrationRepo extends JpaRepository<UserRegistration , String>{

}
