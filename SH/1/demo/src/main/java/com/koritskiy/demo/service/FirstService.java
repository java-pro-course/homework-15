package com.koritskiy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
}
