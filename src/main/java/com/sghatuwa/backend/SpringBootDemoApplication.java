package com.sghatuwa.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        Locale.setDefault(Locale.forLanguageTag("en_US"));
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}
