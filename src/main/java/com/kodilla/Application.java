package com.kodilla;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        SpringApplication.run(Application.class, args);

        Calculator myCalc = new Calculator();
        System.out.println(myCalc.Sum(2,45));
        System.out.println(myCalc.Subtract(67, 37));
    }

}
