package br.com.willian.restaurantapi.controller;

import br.com.willian.restaurantapi.model.dto.ProductInputDto;
import br.com.willian.restaurantapi.model.dto.ProductOutputDto;
import br.com.willian.restaurantapi.model.entitys.Product;
import br.com.willian.restaurantapi.model.projections.ProductProjection;
import br.com.willian.restaurantapi.repository.CategoryRepository;
import br.com.willian.restaurantapi.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductRepository repository;

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public ResponseEntity getProducts(){
        List<ProductProjection> listProducts = this.repository.findAllProduct();

        if(listProducts.isEmpty())
            return ResponseEntity.noContent().build();

        return ResponseEntity.ok(listProducts);
    }

    @PostMapping
    public ResponseEntity saveProduct(@RequestBody @Valid ProductInputDto dto, UriComponentsBuilder uriBuilder){

        System.out.println(dto);
//        Product productSave = this.repository.save(dto.toProduct());

        return ResponseEntity.ok().build();
//                ResponseEntity
//                .created(uriBuilder.path("/products/{id}").buildAndExpand(productSave.getId()).toUri())
//                .body(new ProductOutputDto(productSave));
    }

    @GetMapping("/{id}")
    public ResponseEntity getProduct(@PathVariable Integer id){
        return ResponseEntity.ok(new ProductOutputDto(this.repository.getReferenceById(id)));
    }

    @PutMapping("/{id}")
    public ResponseEntity alterProduct(@PathVariable Integer id, @RequestBody ProductInputDto dto){

        Product product = this.repository.getReferenceById(id);

        Product productAlter = dto.toProduct();
        productAlter.setId(id);

        Product productSave = this.repository.save(productAlter);

        return ResponseEntity.ok(new ProductOutputDto(productSave));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteById(@PathVariable Integer id){
        Product product = this.repository.getReferenceById(id);
        this.repository.deleteById(id);
        return ResponseEntity.ok(new ProductOutputDto(product));
    }
}
