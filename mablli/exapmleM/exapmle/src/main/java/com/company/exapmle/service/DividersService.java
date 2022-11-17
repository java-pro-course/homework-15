package com.company.exapmle.service;

import org.springframework.stereotype.Service;

@Service
public class DividersService {

    public int dividers(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if ((number % i) == 0) {
                count++;
            }
        }
        return count;
    }
}
