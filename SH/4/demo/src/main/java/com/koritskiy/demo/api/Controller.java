package com.koritskiy.demo.api;

import com.koritskiy.demo.objects.User;
import com.koritskiy.demo.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
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

    @GetMapping("dividers")
    public String  dividers (@RequestParam int number){
        return service.divs(number);
    }

    @GetMapping("string/{string}")
    public String string (@PathVariable String string){
        return service.string(string);
    }


    @GetMapping("user/{name}/{surname}/{age}")
    public User getUser(@PathVariable String name, @PathVariable String surname, @PathVariable int age){
        User user = new User(name, surname, age);
        return user;
    }
}
