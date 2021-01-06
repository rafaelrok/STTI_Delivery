package br.com.softtechti.PizzaDelivery.service;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softtechti.PizzaDelivery.DTO.OrderDTO;
import br.com.softtechti.PizzaDelivery.DTO.ProductDTO;
import br.com.softtechti.PizzaDelivery.entities.Order;
import br.com.softtechti.PizzaDelivery.entities.OrderStatus;
import br.com.softtechti.PizzaDelivery.entities.Product;
import br.com.softtechti.PizzaDelivery.repository.OrderRepository;
import br.com.softtechti.PizzaDelivery.repository.ProductRepository;

@Service
public class OrderService {

    @Autowired
    private OrderRepository repository;

    @Autowired
    private ProductRepository productRepository;
    
    //Anotação "Transactional" responsavel por efetuar apenas a leitura no banco de dados
    //evitando a gravação tornando mais rapido
    @Transactional(readOnly = true)
    public List<OrderDTO> findAll() {
        List<Order> list = repository.findOrdersWithProducts();
        return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
    }
    
    @Transactional
    public OrderDTO insert(OrderDTO dto) {
        Order order = new Order(null, dto.getAddress(), dto.getLatitude(), dto.getLongitude(), Instant.now(),
                OrderStatus.PENDING);
        for (ProductDTO p : dto.getProducts()) {
            Product product = productRepository.getOne(p.getId());
            order.getProducts().add(product);
        }
        order = repository.save(order);
        return new OrderDTO(order);
    }
    
    @Transactional
    public OrderDTO setDelivered(Long id) {
        Order order = repository.getOne(id);
        order.setStatus(OrderStatus.DELIVERED);
        order = repository.save(order);
        return new OrderDTO(order);

    }
}
