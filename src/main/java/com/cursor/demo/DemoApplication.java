package com.cursor.demo;

import com.cursor.demo.controller.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);
        program(run);
    }

    static void program(ConfigurableApplicationContext run) {
        Controller controller = run.getBean(Controller.class);
        controller.executeSequenceOfCrudOperation();
    }
}