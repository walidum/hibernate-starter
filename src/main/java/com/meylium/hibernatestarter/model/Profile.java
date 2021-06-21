package com.meylium.hibernatestarter.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profiles")
public class Profile extends BaseEntity {
    @Column(unique = true)
    private String name;

}
