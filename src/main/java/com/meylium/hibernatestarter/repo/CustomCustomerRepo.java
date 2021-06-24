package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Customer;

public interface CustomCustomerRepo {
    Customer findByIdc(long id);
}
