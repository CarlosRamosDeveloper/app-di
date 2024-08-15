package org.carlosramosdev.curso.springboot.di.app.springbootdi.services;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepository;

import java.util.stream.Stream;

public class ProductService {

    private ProductRepository repository = new ProductRepository();
    public Stream<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double increasedPrice = p.getPrice() * 1.25d;
            p.setPrice(increasedPrice.longValue());
            return p;
        });
    }

    public Product findById(Long id) {
        return repository.findById(id);
    }
}
