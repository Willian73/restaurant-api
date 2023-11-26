package br.com.willian.restaurantapi.model.dto;

import br.com.willian.restaurantapi.model.entitys.Category;
import br.com.willian.restaurantapi.model.entitys.Product;

import javax.validation.constraints.NotBlank;
import java.math.BigDecimal;

public record ProductInputDto(@NotBlank String name, @NotBlank String detail, BigDecimal price, Integer category_id) {

    public Product toProduct(){
        return new Product(this.name, this.detail, this.price, new Category(this.category_id));
    }

}
