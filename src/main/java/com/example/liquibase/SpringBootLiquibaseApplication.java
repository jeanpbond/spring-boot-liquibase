package com.example.liquibase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class SpringBootLiquibaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootLiquibaseApplication.class, args);
    }
}
