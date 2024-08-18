package org.carlosramosdev.curso.springboot.di.app.springbootdi;

import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepository;
import org.carlosramosdev.curso.springboot.di.app.springbootdi.repositories.ProductRepositoryJson;
import org.springframework.context.annotation.*;

@Configuration
@PropertySources({
        @PropertySource("classpath:app.properties")
})
public class ValuesConfig {
    @Bean("productJson")
    ProductRepository productRepositoryJson() {
        return new ProductRepositoryJson();
    }
}
