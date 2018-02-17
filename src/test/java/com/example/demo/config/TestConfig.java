package com.example.demo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:test.properties")
public class TestConfig {
    @Bean
    @ConfigurationProperties(prefix="test.datasource")
    @Profile("test")
    public DataSource myDataSource() {
        return DataSourceBuilder.create().build();
    }
}
