package org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class ProductRepositoryImpl implements ProductRepository {
    private List<Product> data;

    public ProductRepositoryImpl(){
        this.data = Arrays.asList(
                new Product(1L,"Memoria ram", 300L),
                new Product(2L, "Cpu i5", 250L),
                new Product(3L, "Cpu AMD Ryzen 6", 500L),
                new Product(4L, "Teclado Logitech 915TLK", 150L)
        );
    }

    @Override
    public List<Product> findAll(){
        return data;
    }

    @Override
    public Product findById(Long id) {
        return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }
}
