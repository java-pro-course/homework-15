package com.kazakov.hw15.service;

import com.kazakov.hw15.object.User;

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
    public String printStr(String strVal){
        String[] full = new String[strVal.length()];
        String[] temp = strVal.split("");
        String out = "";
        for (int i = 0; i < full.length; i++) {
            full[i] = i + " - " + temp[i];
            out = out + full[i] + " | ";
        }


        return out;
    }

    public String getUser(String name, String surname, int age){
        User user = new User(name, surname, age);
        String info = "|Name: " + user.getName() + " |Surname: " + user.getSurname() + " |Age: " + user.getAge();
        return info;
    }
}
