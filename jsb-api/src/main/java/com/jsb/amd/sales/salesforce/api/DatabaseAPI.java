package com.jsb.amd.sales.salesforce.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class DatabaseAPI {
    public static void main(String[] args) {
        //SpringApplication.run(DatabaseAPI.class, args);
        SpringApplication.run(DatabaseAPI.class, args);
    }
}
