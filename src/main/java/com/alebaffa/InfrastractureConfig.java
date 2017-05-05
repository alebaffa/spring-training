package com.alebaffa;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

/**
 * Created by abaffa on 05/05/2017.
 */
@Configuration
public class InfrastractureConfig {
    @Bean
    public DataSource getDataSource(){
        return new DriverManagerDataSource();
    }
}
