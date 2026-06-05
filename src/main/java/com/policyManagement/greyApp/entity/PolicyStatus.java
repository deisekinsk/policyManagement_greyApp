package com.policyManagement.greyApp.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

public enum PolicyStatus {
    PENDING_APPROVAL,
    ISSUED,
    ACTIVE,
    CANCELED,
    EXPIRED,

}