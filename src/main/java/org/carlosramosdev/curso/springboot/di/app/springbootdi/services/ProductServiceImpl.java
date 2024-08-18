package org.carlosramosdev.curso.springboot.di.app.springbootdi.services;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepositoryImpl repository;

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double increasedPrice = p.getPrice() * 1.25d;
            Product newProduct = (Product) p.clone();
            newProduct.setPrice(increasedPrice.longValue());

            return newProduct;
        }).collect(Collectors.toList());
    }

    @Override
    public Product findById(Long id) {
        return repository.findById(id);
    }
}
