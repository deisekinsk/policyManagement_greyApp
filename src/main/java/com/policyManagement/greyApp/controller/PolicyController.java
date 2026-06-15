package com.policyManagement.greyApp.controller;

import com.policyManagement.greyApp.entity.Policy;
import com.policyManagement.greyApp.repository.PolicyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
@RequiredArgsConstructor

public class PolicyController {
        private final PolicyRepository policyRepository;

        @PostMapping
        public Policy create (@RequestBody Policy policy){
            return policyRepository.save(policy);
        }
}
