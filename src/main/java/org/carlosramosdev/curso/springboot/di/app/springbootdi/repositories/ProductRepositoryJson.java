package org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.models.Product;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Repository;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Repository
public class ProductRepositoryJson implements ProductRepository {

    private List<Product> list;
    public ProductRepositoryJson() {
        Resource resource = new ClassPathResource("json/product.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            list = Arrays.asList(objectMapper.readValue(resource.getFile(), Product[].class));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Product> findAll() {
        return list;
    }

    @Override
    public Product findById(Long id) {
        return null;
    }
}
