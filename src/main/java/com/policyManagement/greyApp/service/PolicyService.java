package com.policyManagement.greyApp.service;

import com.policyManagement.greyApp.dto.PolicyRequestDTO;
import com.policyManagement.greyApp.dto.PolicyResponseDTO;
import com.policyManagement.greyApp.entity.Policy;
import com.policyManagement.greyApp.repository.PolicyRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private PolicyRepository policyRepository;

    @Transactional
    public PolicyResponseDTO createPolicy
            (final PolicyRequestDTO policyRequestDTO){

        if(policyRepository.existsPoliciesBy(
                policyRequestDTO.getPolicyNumber())){

            throw new IllegalArgumentException(
                    String.format("ERRO: %s !", policyRequestDTO.getPolicyNumber()));
        }

        //set
        Policy policy = new Policy();
        policy.setPolicyNumber(policyRequestDTO.getPolicyNumber());
        policy.setPolicyValue(policyRequestDTO.getPolicyValue());
        policy.setPolicyAward(policyRequestDTO.getPolicyAward());
        policy.setEffectiveDate(policyRequestDTO.getEffectiveDate());
        policy.setExpiryDate(policyRequestDTO.getExpiryDate());
        policy.setPolicyType(policyRequestDTO.getPolicyType());
        policy.setPolicyStatus(policyRequestDTO.getPolicyStatus());


        //saved
        Policy saved = policyRepository.save(policy);

        return new PolicyResponseDTO.builder()
                .policyNumber(saved.getPolicyNumber())
                .policyValue(saved.getPolicyValue())
                .policyAward(saved.getPolicyAward())
                .effectiveDate(saved.getEffectiveDate())
                .expirateDate(saved.getExpiryDate())
                .policyType(saved.getPolicyType())
                .policySatus(saved.getPolicyStatus())
                .build();

    }


}
