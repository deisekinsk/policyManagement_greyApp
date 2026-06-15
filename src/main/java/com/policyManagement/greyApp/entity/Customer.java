package com.policyManagement.greyApp.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Table (name = "TB_CUSTOMER")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor


public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID customerID;
    @Column
    private String name;
    @Column
    private String idCardNumber;
    @Column
    private String email;
    @Column
    private LocalDateTime registerDate;

//    //data relation
//    @OneToMany(
//            mappedBy = "customer",
//            cascade = CascadeType.ALL
//    )
//    private List<Policy> policyList;
//
//    @OneToOne(
//            mappedBy = "customer",
//            cascade = CascadeType.ALL
//    )
//    private PhysicalAddress physicalAddress;

}
