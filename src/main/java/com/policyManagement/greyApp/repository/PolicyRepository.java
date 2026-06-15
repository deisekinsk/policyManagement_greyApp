package com.policyManagement.greyApp.repository;

import com.policyManagement.greyApp.entity.Policy;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PolicyRepository
        extends JpaRepository <Policy, UUID> {

        boolean existsPoliciesBy(String policyNumber);
}
