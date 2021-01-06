package br.com.softtechti.PizzaDelivery.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softtechti.PizzaDelivery.DTO.OrderDTO;
import br.com.softtechti.PizzaDelivery.entities.Order;
import br.com.softtechti.PizzaDelivery.repository.OrderRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;
    
    //Anotação "Transactional" responsavel por efetuar apenas a leitura no banco de dados
    //evitando a gravação tornando mais rapido
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());       
    }
}
