package com.koritskiy.demo.service;

import org.springframework.stereotype.Service;

@Service
public class FirstService {

    public int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    public String divs(int number){
        String divs = "";
        for (int i = number; i > 0; i--) {
            if(number % i == 0) divs += (int) i + "{Типа enter}";
        }
        return divs;
    }

    public String string (String string){
        char[] chars = string.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += i + " - " + chars[i] + " {Типо enter} ";
        }
        return str;
    }
}
