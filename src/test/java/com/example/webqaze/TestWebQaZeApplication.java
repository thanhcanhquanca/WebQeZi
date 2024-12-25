package com.example.webqaze;

import org.springframework.boot.SpringApplication;

public class TestWebQaZeApplication {

    public static void main(String[] args) {
        SpringApplication.from(WebQaZeApplication::main).with(TestcontainersConfiguration.class).run(args);
    }

}
