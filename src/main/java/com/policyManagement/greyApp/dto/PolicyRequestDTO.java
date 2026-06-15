package com.policyManagement.greyApp.dto;

import com.policyManagement.greyApp.entity.PolicyStatus;
import com.policyManagement.greyApp.entity.PolicyType;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class PolicyRequestDTO {

    private String policyNumber;
    private BigDecimal policyValue;
    private BigDecimal policyAward;
    private LocalDate effectiveDate;
    private LocalDate expiryDate;
    private PolicyType policyType;
    private PolicyStatus policyStatus;

    private CustomerRequestDTO customerRequestDTO;

}
