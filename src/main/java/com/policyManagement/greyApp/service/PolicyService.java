package com.policyManagement.greyApp.service;

import com.policyManagement.greyApp.dto.PolicyRequestDTO;
import com.policyManagement.greyApp.dto.PolicyResponseDTO;
import com.policyManagement.greyApp.entity.Policy;
import com.policyManagement.greyApp.mapper.PolicyMapper;
import com.policyManagement.greyApp.repository.PolicyRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PolicyService {

    private final PolicyRepository policyRepository;

    @Transactional
    public PolicyResponseDTO createPolicy
            (final PolicyRequestDTO policyRequestDTO){

        if(policyRepository.existsByPolicyNumber(
                policyRequestDTO.getPolicyNumber())){

            throw new IllegalArgumentException(
                    String.format("ERRO: %s !", policyRequestDTO.getPolicyNumber()));
        }

        //set
        Policy policy = PolicyMapper.toEntity(policyRequestDTO);


        //saved
        Policy saved = policyRepository.save(policy);

        return PolicyMapper.toDTO(saved);

    }


}
