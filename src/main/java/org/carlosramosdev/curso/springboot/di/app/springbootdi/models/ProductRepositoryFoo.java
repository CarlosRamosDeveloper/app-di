package org.carlosramosdev.curso.springboot.di.app.springbootdi.models;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepository;
import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;


@Repository
public class ProductRepositoryFoo implements ProductRepository {

    @Override
    public List<Product> findAll() {
        return Collections.singletonList(new Product(1L,"test", 250L));
    }

    @Override
    public Product findById(Long id) {
        return new Product(id,"test", 250L);
    }
}
