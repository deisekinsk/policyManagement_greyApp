package com.policyManagement.greyApp.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table (name = "Policy")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID policyID;
    @Column
    private String policyNumber;
    @Column
    private BigDecimal policyValue;
    @Column
    private BigDecimal policyAward;
    @Column
    private LocalDate effectiveDate;
    @Column
    private LocalDate expiryDate;

    @Column
    private PolicyType policyType;
    @Column
    private PolicyStatus policyStatus;

    //relation
    @ManyToOne
    @JoinColumn(name = "customerID")
    private Customer customer;



}


