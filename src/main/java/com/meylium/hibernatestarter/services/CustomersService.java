package com.meylium.hibernatestarter.services;

import com.meylium.hibernatestarter.model.Customer;
import com.meylium.hibernatestarter.model.Profile;
import com.meylium.hibernatestarter.repo.CustomerRepo;
import com.meylium.hibernatestarter.repo.ProfileRepo;
import org.springframework.stereotype.Service;

@Service
public class CustomersService {
    private final CustomerRepo customerRepo;
    private final ProfileRepo profileRepo;

    public CustomersService(CustomerRepo customerRepo, ProfileRepo profileRepo) {
        this.customerRepo = customerRepo;
        this.profileRepo = profileRepo;
    }


    public Customer create(Customer customer) {
        return this.customerRepo.save(customer);
    }

    public Profile create(Profile profile) {
        return this.profileRepo.save(profile);
    }

    public void delete(Customer customer) {
        this.customerRepo.deleteById(customer.getId());
    }

    public void delete(Profile profile) {
        this.customerRepo.deleteById(profile.getId());
    }
}
