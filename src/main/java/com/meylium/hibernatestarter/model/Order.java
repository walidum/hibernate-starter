package com.meylium.hibernatestarter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.math.BigDecimal;

@Entity
@Table(name = "orders")
@Getter
@Setter
@NoArgsConstructor
public class Order extends BaseEntity {

    @Column(unique = true)
    private String ref;
    private BigDecimal amount;
    @Column(name = "billing_address")
    private String billingAddress;
    @ManyToOne
    private Customer customer;
}
