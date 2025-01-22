package com.example.k8s.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    /**
     * Handles GET requests to the root endpoint ("/") and returns a greeting message.
     *
     * @return A simple "Hello, World" string as a response
     */
    @GetMapping("/")
    public String sayHello() {
        return "Hello, World";
    }

    /**
     * Deliberately triggers an arithmetic exception by performing a division by zero operation.
     *
     * @throws ArithmeticException when attempting to divide by zero
     * @see ArithmeticException
     */
    @GetMapping("/error")
    public void sayError() {
        System.out.println(1/0);
    }
}
