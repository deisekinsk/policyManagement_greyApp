package com.policyManagement.greyApp.service;

import com.policyManagement.greyApp.dto.PolicyRequestDTO;
import com.policyManagement.greyApp.dto.PolicyResponseDTO;
import com.policyManagement.greyApp.entity.Policy;
import com.policyManagement.greyApp.repository.PolicyRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PolicyService {

    private PolicyRepository policyRepository;

    @Transactional
    public PolicyResponseDTO createPolicie
            (final PolicyRequestDTO policyRequestDTO){
        if(policyRepository.existsPoliciesBy(
                policyRequestDTO.getPolicy())){
            throw new Exception(
                    String.format("ERRO: %s !", policyRequestDTO.getPolicy())
        }
    }

    //set
    Policy policy = new Policy();
    policy.setPolicy(policyRequestDTO.getPolicy());


    //saved
    Policy saved = policyRepository.save(policy);
}
