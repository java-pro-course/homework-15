package com.kazakov.hw15.services;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    public int multiply(int a, int b){
        return a * b;
    }
    public String findDividers(int a){
        List list = new ArrayList();
        for(int i = 1; i<=a; i++) {
            if(a % i == 0){
                list.add(i);
            }
        }
        String out = "";
        for (int i = 0; i < list.size(); i++) {
            out = out + " " + list.get(i).toString();
        }
        return out;
    }
}
