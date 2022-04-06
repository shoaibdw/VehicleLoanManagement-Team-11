package com.vehicleLoanManagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.vehicleLoanManagement.entity.AdminDetail;
import com.vehicleLoanManagement.request.AdminDetailRequest;

@Repository
public interface AdminDetailRepo extends JpaRepository<AdminDetail,String>{

}
