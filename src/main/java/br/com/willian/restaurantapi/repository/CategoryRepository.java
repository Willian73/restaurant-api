package br.com.willian.restaurantapi.repository;

import br.com.willian.restaurantapi.model.entitys.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
