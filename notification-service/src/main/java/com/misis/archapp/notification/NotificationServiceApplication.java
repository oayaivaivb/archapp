package com.misis.archapp.notification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.misis.archapp.contract.configuration.RabbitConfiguration;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(RabbitConfiguration.class)
public class NotificationServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotificationServiceApplication.class, args);
    }

}
