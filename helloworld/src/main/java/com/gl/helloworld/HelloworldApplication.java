package com.gl.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloworldApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(HelloworldApplication.class);
        app.run(args);
    }

}
