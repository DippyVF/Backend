package org.example.model.service;

import org.example.model.Order;
import org.example.model.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class OrderService {

    private final OrderRepository orderRepository;

    @Autowired
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }
    public Order findOne(int id) {
         Optional<Order> foundOrder = orderRepository.findById(id);
         return foundOrder.orElse(null);
    }
}
