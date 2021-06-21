package com.meylium.hibernatestarter.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "customers")
@Getter
@Setter
@NoArgsConstructor
public class Customer extends BaseEntity {

    @Column(name = "full_name")
    private String fullName;

    @Temporal(TemporalType.DATE)
    @Column(name = "birth_date")
    private Date birthDate;

    @OneToOne(cascade = CascadeType.REMOVE)
    private Profile profile;

    @OneToMany(mappedBy = "customer", cascade = {CascadeType.REMOVE})
    private List<Order> orders;

}
