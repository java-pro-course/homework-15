package com.company.exapmle.API;

import com.company.exapmle.service.MultiplyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiplyController {
    private MultiplyService multiplyService;

    public MultiplyController (MultiplyService service){
        this.multiplyService = service;
    }

    @GetMapping("multiply/{firstNumber}/{secondNumber}")
    public int multiply(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return  multiplyService.multiply(firstNumber, secondNumber);
    }
}
