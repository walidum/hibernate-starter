package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Customer;
import com.meylium.hibernatestarter.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepo extends JpaRepository<Order, Long> {
    Order findByRef(String name);

    List<Order> findByCustomer(Customer customer);
}
