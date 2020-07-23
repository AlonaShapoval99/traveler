package com.shapoval.traveler;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.shapoval.traveler.service", "com.shapoval.traveler.service.implementation", "com.shapoval.traveler.controllers"})
@EntityScan(basePackages = {"com.shapoval.traveler.entity"})
@EnableJpaRepositories(basePackages = {"com.shapoval.traveler.repository"})
public class TravelerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TravelerApplication.class, args);
    }

}
