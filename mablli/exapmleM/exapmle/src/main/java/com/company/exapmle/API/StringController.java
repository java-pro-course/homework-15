package com.company.exapmle.API;

import com.company.exapmle.service.StringService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StringController {
    private StringService stringService;

    public StringController(StringService service){
        this.stringService = service;
    }

    @GetMapping("string/{string}")
    public String string (@PathVariable String string){
          return stringService.string(string);
    }
}
