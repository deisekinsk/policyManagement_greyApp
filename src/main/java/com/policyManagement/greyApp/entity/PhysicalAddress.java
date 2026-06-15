package com.policyManagement.greyApp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "TB_ADDRESS")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class PhysicalAddress {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID addressID;
    @Column
    private String streetName;
    private String number;
    private String city;
    private String state;
    private String country;

//    @OneToOne
//    @JoinColumn(name = "customerID")
//    private Customer customer;
}
