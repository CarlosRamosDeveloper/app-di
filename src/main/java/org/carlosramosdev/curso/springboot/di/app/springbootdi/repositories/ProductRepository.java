package org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductRepository {
    private List<Product> data;

    public ProductRepository(){
        this.data = Arrays.asList(
                new Product(1L,"Memoria ram", 300L),
                new Product(2L, "Cpu i5", 250L),
                new Product(3L, "Cpu AMD Ryzen 6", 500L),
                new Product(4L, "Teclado Logitech 915TLK", 150L)
        );
    }

    public List<Product> findAll(){
        return data;
    }
}
