package org.carlosramosdev.curso.springboot.di.app.springbootdi.controllers;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.services.ProductServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SomeController {
    ProductServiceImpl service = new ProductServiceImpl();

    @GetMapping("/")
    public List<Product> list(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Product show(@PathVariable Long id) {
        return service.findById(id);
    }
}
