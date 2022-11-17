package com.example.demo.services;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;

@Service
public class FirstService {
    public int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }
    public ArrayList<Integer> getDividers(int i){
        ArrayList<Integer> a = new ArrayList<>();
        for (int i1 = 1; i1 < i; i1++){
            if(i % i1 == 0){

                a.add(i1);
            }
        }
        return a;
    }
    public ArrayList<String> numFor(String i){
        ArrayList<String> a = new ArrayList<>();

        for (int i1 = 0; i1 < i.length(); i1++){
        a.add(i1 + " - " + i.charAt(i1));
        }
        return a;
    }

    public String sayHello() {
        return "Hello, world!";
    }
}

