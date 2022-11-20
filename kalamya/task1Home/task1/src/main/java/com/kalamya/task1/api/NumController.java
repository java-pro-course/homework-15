package com.kalamya.task1.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NumController {
    public NumController(){



    }
    @GetMapping("multiply/{num1}/{num2}")
    public int NumMultiply(@PathVariable int num1, @PathVariable int num2){
        return num1 * num2;
    }
}
