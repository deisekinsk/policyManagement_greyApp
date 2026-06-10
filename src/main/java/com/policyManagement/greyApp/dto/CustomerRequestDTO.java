package com.policyManagement.greyApp.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class CustomerRequestDTO {

    private String name;
    private String idCardNumber;
    private String email;
    private LocalDateTime registerDate;

    private PhysicalAddressDTO addressDTO;
}
