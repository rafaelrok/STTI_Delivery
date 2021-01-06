package br.com.softtechti.PizzaDelivery.DTO;

import java.io.Serializable;

import br.com.softtechti.PizzaDelivery.entities.Product;

public class ProductDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;

    public ProductDTO() {

    }

    public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
        this.imageUri = imageUri;
    }

    // Metodo responsavel por preencher a classe DTO que vai efetuar a transferencia de dados para frontEnd
    public ProductDTO(Product produtos) {
        id = produtos.getId();
        name = produtos.getName();
        price = produtos.getPrice();
        description = produtos.getDescription();
        imageUri = produtos.getImageUri();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
    
    
}
