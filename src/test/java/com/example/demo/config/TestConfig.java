package com.example.demo.config;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@PropertySource("classpath:test.properties")
public class TestConfig {
//    @Bean
//    @ConfigurationProperties(prefix="test.datasource")
//    @Profile("test")
//    public DataSource myDataSource() {
//        return DataSourceBuilder.create().build();
//    }

    @Bean
    @Profile("test")
    public DataSource testDataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("org.h2.Driver");
        source.setUrl("jdbc:h2:mem:db;DB_CLOSE_DELAY=-1");
        source.setUsername("sa");
        source.setPassword("sa");
        return source;
    }

}
