package ru.brill;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class Gateway {
    public static void main(String[] args) {
        new SpringApplicationBuilder().sources(Gateway.class).run(args);
    }
}