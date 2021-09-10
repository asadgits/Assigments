package com.nisum.testproject.firsttestmockito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FirstTestMockitoApplication {

    static{
        System.out.println("abc");
    }
    public static void main(String[] args) {
        SpringApplication.run(FirstTestMockitoApplication.class, args);
    }

}
