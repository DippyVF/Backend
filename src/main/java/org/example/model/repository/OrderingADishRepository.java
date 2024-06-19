package org.example.model.repository;

import org.example.model.OrderingADish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderingADishRepository extends JpaRepository<OrderingADish, Integer> {
}
