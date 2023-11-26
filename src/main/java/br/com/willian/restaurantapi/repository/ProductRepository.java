package br.com.willian.restaurantapi.repository;

import br.com.willian.restaurantapi.model.entitys.Product;
import br.com.willian.restaurantapi.model.projections.ProductProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    @Query(value = "SELECT p.name, p.detail, p.price, c.name as category FROM products p INNER JOIN categories c ON p.category_id=c.id", nativeQuery = true)
    List<ProductProjection> findAllProduct();
}
