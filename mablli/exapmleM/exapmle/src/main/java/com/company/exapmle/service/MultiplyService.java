package com.company.exapmle.service;

import org.springframework.stereotype.Service;

@Service
public class MultiplyService {

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

}
