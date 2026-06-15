package com.policyManagement.greyApp.controller;

import com.policyManagement.greyApp.dto.PolicyRequestDTO;
import com.policyManagement.greyApp.dto.PolicyResponseDTO;
import com.policyManagement.greyApp.service.PolicyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/policies")
@RequiredArgsConstructor

public class PolicyController {

        private final PolicyService policyService;

        @PostMapping
        public PolicyResponseDTO create (
                @RequestBody PolicyRequestDTO policyRequestDTO){

            return policyService.createPolicy((policyRequestDTO));
        }
}
