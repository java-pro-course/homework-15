package com.example.demo.api;

import com.example.demo.object.User;
import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyController{
    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }
    @GetMapping("string/{words}")
    public ArrayList<String> Words(@PathVariable String words){
        return service.words(words);
    }

    @GetMapping("multiply/{firstNum}/{secondNum}")
        public int multiply(@PathVariable int firstNum,
    @PathVariable int secondNum){
        return service.num(firstNum, secondNum);
    }
    @GetMapping("dividers")
    public int dividers(@RequestParam("number") int number){
        return service.dividers(number);
}
    @GetMapping("user/{name}/{name2}/{age}")
    public User User(@PathVariable String name, @PathVariable String name2, @PathVariable int age){
        User u = new User(name, name2, age);
        return u;
    }
}

