package com.policyManagement.greyApp.repository;

import com.policyManagement.greyApp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository
        extends JpaRepository<Customer, UUID> {

}
