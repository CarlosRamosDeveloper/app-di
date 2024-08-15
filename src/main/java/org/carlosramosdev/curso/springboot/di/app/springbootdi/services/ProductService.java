package org.carlosramosdev.curso.springboot.di.app.springbootdi.services;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductService {

    private ProductRepository repository = new ProductRepository();
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double increasedPrice = p.getPrice() * 1.25d;
            p.setPrice(increasedPrice.longValue());
            return p;
        }).collect(Collectors.toList());
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
}
