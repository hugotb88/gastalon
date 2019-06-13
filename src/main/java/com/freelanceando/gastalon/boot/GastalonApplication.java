package com.freelanceando.gastalon.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = {"com.freelanceando"})
@EnableConfigurationProperties
public class GastalonApplication {

    public static void main(String[] args) {
        SpringApplication.run(GastalonApplication.class, args);
    }

}
