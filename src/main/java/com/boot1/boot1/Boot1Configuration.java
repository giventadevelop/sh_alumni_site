package com.boot1.boot1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Boot1Configuration {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
