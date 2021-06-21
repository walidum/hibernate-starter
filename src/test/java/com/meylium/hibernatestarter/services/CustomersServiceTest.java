package com.meylium.hibernatestarter.services;

import com.meylium.hibernatestarter.model.Customer;
import com.meylium.hibernatestarter.repo.CustomerRepo;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.util.AssertionErrors;

import java.util.Date;

@SpringBootTest
@Slf4j
class CustomersServiceTest {
    @Autowired
    private CustomerRepo customerRepo;
    @Autowired
    private CustomersService customersService;

    @Test
    void create() {
        String fullName = "FULL NAME FOR TESTING";
        Customer customer = new Customer();
        customer.setBirthDate(new Date());
        customer.setFullName(fullName);
        this.customersService.create(customer);

        Customer customer1 = this.customerRepo.findByFullName(fullName);
        AssertionErrors.assertNotNull("customer not created !", customer1);
        log.info(customer1.getId() + "");
    }

    @Test
    void testCreate() {
    }

    @Test
    void delete() {
    }

    @Test
    void testDelete() {
    }
}
