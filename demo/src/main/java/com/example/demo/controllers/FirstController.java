package com.example.demo.controllers;

import com.example.demo.objects.User;
import com.example.demo.services.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController // аннотация, которая сообщает спринг-буту, что здесь будут API
public class FirstController {

    private FirstService service;

    public FirstController(FirstService service) {
        this.service = service;
    }

    @GetMapping // определяем HTTP-метод и URL
    public String sayHello() {
        return service.sayHello();
    }

    @GetMapping("codemika") // определяем HTTP-метод и URL
    public String tellMeCodemika() {
        return "Codemika. Java Pro!";
    }


    @GetMapping("sum/{firstNumber}/{secondNumber}")
    public int sum(@PathVariable int firstNumber,
                   @PathVariable int secondNumber) {
        return service.multiply(firstNumber, secondNumber);
    }
    @GetMapping("user/{name}/{surname}/{age}")
    public User user(@PathVariable String name,
                     @PathVariable String surname,
                     @PathVariable int age) {
        User u = new User(name, surname, age);
        return u;
    }
    @GetMapping("string/{string}")
    public ArrayList<String> asdasd(@PathVariable String string) {
        return service.numFor(string);
    }


    @GetMapping("dividers")
    public ArrayList<Integer> calculator(@RequestParam("number") int number) {
        return service.getDividers(number);
    }
}
