package org.carlosramosdev.curso.springboot.di.app.springbootdi.services;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    final private ProductRepository repository;

    @Autowired
    private Environment env;

    public ProductServiceImpl(@Qualifier("productList") ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Product> findAll() {
        return repository.findAll().stream().map(p -> {
            Double increasedPrice = p.getPrice() * env.getProperty("taxes.config", Double.class);
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
