package br.com.softtechti.PizzaDelivery.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.softtechti.PizzaDelivery.DTO.ProductDTO;
import br.com.softtechti.PizzaDelivery.entities.Product;
import br.com.softtechti.PizzaDelivery.repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;
    
    //Anotação "Transactional" responsavel por efetuar apenas a leitura no banco de dados
    //evitando a gravação tornando mais rapido
    @Transactional(readOnly = true)
    public List<ProductDTO> findAll() {
        List<Product> list = repository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());       
    }
}
