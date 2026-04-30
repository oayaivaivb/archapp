package com.misis.archapp.user;

import org.springframework.context.annotation.Import;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.misis.archapp.contract.configuration.RabbitConfiguration;

@SpringBootApplication
@Import(RabbitConfiguration.class)
public class UserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserServiceApplication.class, args);
    }

}
