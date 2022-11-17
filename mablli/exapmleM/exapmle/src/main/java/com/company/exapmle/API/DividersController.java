package com.company.exapmle.API;

import com.company.exapmle.service.DividersService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DividersController {
    private DividersService dividersService;

    public DividersController(DividersService service){
        this.dividersService = service;
    }

    @GetMapping("dividers")
    public int dividers(@RequestParam ("number") int number){
        return dividersService.dividers(number);
    }
}
