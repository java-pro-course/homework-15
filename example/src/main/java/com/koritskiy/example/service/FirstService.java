package com.koritskiy.example.service;

import org.springframework.stereotype.Service;

@Service
public class FirstService {
    public int calculate(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public String sayHello() {
        return "Hello, world!";
    }
}
