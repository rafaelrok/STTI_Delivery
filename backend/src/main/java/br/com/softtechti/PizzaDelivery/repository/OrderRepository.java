package br.com.softtechti.PizzaDelivery.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softtechti.PizzaDelivery.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
    
}
