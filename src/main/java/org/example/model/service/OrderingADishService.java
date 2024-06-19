package org.example.model.service;

import org.example.model.Dish;
import org.example.model.OrderingADish;
import org.example.model.repository.OrderingADishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class OrderingADishService {

    private final OrderingADishRepository orderingADishRepository;

    @Autowired
    public OrderingADishService(OrderingADishRepository orderingADishRepository) {
        this.orderingADishRepository = orderingADishRepository;
    }
    public OrderingADish findOne(int id) {
        Optional<OrderingADish> foundOrderingADish = orderingADishRepository.findById(id);
        return foundOrderingADish.orElse(null);
    }

    @Transactional
    public void add(int id, Dish dish) {
        orderingADishRepository.findById(id);
        orderingADishRepository.save(dish);
    }
}
