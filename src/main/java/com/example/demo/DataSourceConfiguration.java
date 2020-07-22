package com.example.demo;

import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration

public class DataSourceConfiguration {


        @Bean
        public DataSource getDataSource() {
            DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
            dataSourceBuilder.username(System.getenv("username"));
            dataSourceBuilder.password(System.getenv("password"));
            dataSourceBuilder.url(System.getenv("url"));

            return dataSourceBuilder.build();
        }


}
