package org.carlosramosdev.curso.springboot.di.app.springbootdi;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@Configuration
@PropertySources({
        @PropertySource("classpath:app.properties")
})
public class ValuesConfig {
}
