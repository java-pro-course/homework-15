package com.kazakov.hw15.api;

import com.kazakov.hw15.services.Service;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    private Service service;

    public Controller(Service service) {
        this.service = service;
    }

    @GetMapping("multiply/{firstNumber}/{secondNumber}")
    public int getMult(@PathVariable int firstNumber, @PathVariable int secondNumber) {
        return service.multiply(firstNumber, secondNumber);
    }

    @GetMapping("dividers")
    @ResponseBody
    public String getDiv(@RequestParam("number") int num) {
        return service.findDividers(num);
    }
}
