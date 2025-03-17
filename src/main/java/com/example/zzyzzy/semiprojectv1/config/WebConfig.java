package com.example.zzyzzy.semiprojectv1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

@Configuration
public class WebConfig {

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate restTemplate = new RestTemplate();

        // UTF-8 인코딩 설정
        restTemplate.getMessageConverters().add(
            0, new StringHttpMessageConverter(StandardCharsets.UTF_8)
        );

        return restTemplate;
    }

}
