package br.com.softtechti.PizzaDelivery.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.softtechti.PizzaDelivery.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    
    List<Product> findAllByOrderByNameAsc();
}
