package com.company.exapmle.service;

import org.springframework.stereotype.Service;

@Service
public class StringService {

    public String string (String string){
        char[] chars = string.toCharArray();
        String str = "";
        for (int i = 0; i < chars.length; i++) {
            str += i + " - " + chars[i] + "  ";
        }
        return str;
    }
}
