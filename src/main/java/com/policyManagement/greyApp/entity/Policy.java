package com.policyManagement.greyApp.entity;
import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table (name = "TB_POLICY")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Policy {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID policyID;
    @Column (nullable = false, unique = true)
    private String policyNumber;
    @Column (nullable = false)
    private BigDecimal policyValue;
    @Column (nullable = false)
    private BigDecimal policyAward;
    @Column (nullable = false)
    private LocalDate effectiveDate;
    @Column (nullable = false)
    private LocalDate expiryDate;

    @Enumerated(EnumType.STRING)
    private PolicyType policyType;
    @Enumerated(EnumType.STRING)
    private PolicyStatus policyStatus;

//    //relation
//    @ManyToOne
//    @JoinColumn(name = "customerID")
//    private Customer customer;



}


