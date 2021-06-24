package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Customer;
import com.meylium.hibernatestarter.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepo extends JpaRepository<Customer, Long>, CustomCustomerRepo {
    Customer findByFullName(String fullName);

    Customer findByProfile(Profile profile);
}
