package com.kalamya.task23.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ListService {
    public String shareNumS(int num1) {
      String allNumDiv = "";
        for (int i = 1; i <= num1; i++) {
            if (num1 % i == 0)
                allNumDiv += i + "\n";

        }

        return allNumDiv;

    }

    public String NumLetterS(String word){
        String letter = "";
        for (int i = 0; i < word.length(); i++){
           letter += i + " - " + word.charAt(i) + " ";
        }
     return letter;
    }

}

