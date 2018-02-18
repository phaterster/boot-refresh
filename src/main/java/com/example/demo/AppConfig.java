package com.example.demo;

import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.*;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@EnableJpaRepositories
public class AppConfig extends WebMvcAutoConfiguration {


//    @Bean
//    @ConfigurationProperties(prefix="my.datasource")
//    @Profile("!test")
//    public DataSource myDataSource() {
//        //schema controlled by spring.jpa.properties.hibernate.default_schema=xxx
//        return DataSourceBuilder.create().build();
//    }
    @Bean
    @Profile("!test")
    public DataSource myDataSource() {
        DriverManagerDataSource source = new DriverManagerDataSource();
        source.setDriverClassName("org.postgresql.Driver");
        source.setUrl("jdbc:postgresql://10.10.22.255:5432/student");
        source.setUsername("student");
        source.setPassword("wsiz#1234");
        source.setSchema("xxx");
        return source;
    }
}
