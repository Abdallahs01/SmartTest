package com.example.smarttest.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenAPIConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("SmartTest API")
                .version("1.0.0")
                .description("REST API to manage and store automated test results")
                .contact(new Contact()
                    .name("Abdallah Saida")
                    .email("abed.saida.9@gmail.com")  // You can replace with GitHub URL or remove this line
                )
            );
    }
    
}
