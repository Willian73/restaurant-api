package br.com.willian.restaurantapi.model.entitys;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@EqualsAndHashCode(of = {"id"})
@ToString(of = {"id", "name", "detail", "price"})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String detail;
    private BigDecimal price;
    @ManyToOne
    private Category category;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Product(String name, String detail, BigDecimal price) {
        this.name = name;
        this.detail = detail;
        this.price = price;
    }

    public Product(String name, String detail, BigDecimal price, Category category) {
        this.name = name;
        this.detail = detail;
        this.price = price;
        this.category = category;
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

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
