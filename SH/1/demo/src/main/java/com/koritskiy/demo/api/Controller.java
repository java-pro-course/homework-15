package com.koritskiy.demo.api;

import com.koritskiy.demo.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    public Controller(FirstService service) {
        this.service = service;
    }

    private FirstService service;



    @GetMapping("/multiply/{firstNumber}/{secondNumber}")
    public int multiply(@PathVariable int firstNumber,@PathVariable int secondNumber){
        return service.multiply(firstNumber, secondNumber);
    }
}
