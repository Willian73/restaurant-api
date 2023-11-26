package br.com.willian.restaurantapi.model.dto;

import br.com.willian.restaurantapi.model.entitys.Product;

import java.math.BigDecimal;

public class ProductOutputDto {

    private Integer id;
    private String name;
    private BigDecimal price;
    private String category;

    public ProductOutputDto() {
    }

    public ProductOutputDto(Integer id, String name, BigDecimal price, String category) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public ProductOutputDto(Product product){
        this.id = product.getId();
        this.name = product.getName();
        this.price = product.getPrice();
        this.category = product.getCategory().getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
