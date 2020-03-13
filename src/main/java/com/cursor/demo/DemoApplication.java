package com.cursor.demo;

import com.cursor.demo.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
        startApp(context);
    }

    static void startApp(ConfigurableApplicationContext context) {
        Controller controller = context.getBean(Controller.class);
        controller.executeSequenceOfCrudOperation();
    }
}