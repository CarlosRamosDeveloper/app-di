package org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;

import java.util.List;

public interface ProductRepository {
    List<Product> findAll();
    Product findById(Long id);


}
