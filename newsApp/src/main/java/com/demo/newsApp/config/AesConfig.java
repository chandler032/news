package com.demo.newsApp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AesConfig {

    @Value("${news.connection.jasypt.encryptor.password}")
    private String ApiKey;

    public String getApiKey() {
        return ApiKey;
    }
}
