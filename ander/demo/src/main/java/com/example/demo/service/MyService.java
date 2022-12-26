package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class MyService {
    public int num(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }
    public int getDividers(int num){
        int a = 0;
        for (int j = 0; j <= num; j++) {
            if (num % j == 0) {
                a++;
            }
        }
        return a;
    }
    public ArrayList<String> words(String a){
        ArrayList<String> b = new ArrayList<>();
        for (int i = 0; i <= a.length(); i++) {
        b.add(i + ": " + b.get(i));
        }
    return b;
    }
}

