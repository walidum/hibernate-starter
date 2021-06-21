package com.meylium.hibernatestarter.repo;

import com.meylium.hibernatestarter.model.Customer;
import com.meylium.hibernatestarter.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepo extends JpaRepository<Order, Long> {
    Order findByRef(String name);

    List<Order> findByCustomer(Customer customer);
}
