package com.meylium.hibernatestarter.services;

import com.meylium.hibernatestarter.model.Order;
import com.meylium.hibernatestarter.repo.OrderRepo;
import org.springframework.stereotype.Service;

@Service
public class OrdersService {
    private final OrderRepo orderRepo;

    public OrdersService(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    public Order create(Order order) {
        return this.orderRepo.save(order);
    }

    public Order update(Order order) {
        return this.orderRepo.save(order);
    }

    public void remove(long id) {
        this.orderRepo.deleteById(id);
    }
}
