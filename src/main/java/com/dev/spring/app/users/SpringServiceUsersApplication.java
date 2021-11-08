package com.dev.spring.app.users;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.dev.spring.app.commons.users.models.entity"})
@SpringBootApplication
public class SpringServiceUsersApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringServiceUsersApplication.class, args);
    }

}
