package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.UserDetail;

@RepositoryRestResource(collectionResourceRel="userDetails",path="userDetails")
public interface UserDetailRepo extends JpaRepository <UserDetail, Long> {

}
