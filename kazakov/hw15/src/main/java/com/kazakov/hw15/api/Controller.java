package com.kazakov.hw15.api;

import com.kazakov.hw15.service.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("multiply/{firstNumber}/{secondNumber}") // task1
    public int getMult(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return service.multiply(firstNumber, secondNumber);
    }

    @GetMapping("dividers") // task2
    public String getDiv(@RequestParam("number") int num) {
        return service.findDividers(num);
    }

    @GetMapping("string/{strVal}") // task3
    public String getString(@PathVariable String strVal){
        return service.printStr(strVal);
    }

    @GetMapping("user/{name}/{surname}/{age}")
    public String getUser(@PathVariable String name, @PathVariable String surname, @PathVariable int age){
        return service.getUser(name, surname, age);
    }




//    @GetMapping("string/{strVal}")                                //question
//    public String getString(@PathVariable String strVal){
//        String[] result = strVal.split("");
//        for (int i = 0; i < strVal.length(); i++) {
//            return i + " - " + result[i];
//        }
//        return "";
//    }

}
