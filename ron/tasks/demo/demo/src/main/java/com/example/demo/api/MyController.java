package com.example.demo.api;

import com.example.demo.object.User;
import com.example.demo.service.MyService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class MyController{
    private MyService service;

    public MyController(MyService service) {
        this.service = service;
    }
    @GetMapping("string/helloWorld")
    public ArrayList<String> Words(@PathVariable String words){
        return service.words(words);
    }

    @GetMapping("multiply/2/4")
        public int Composition(@PathVariable int firstNum,
    @PathVariable int secondNum){
        return service.num(firstNum, secondNum);
    }
    @GetMapping("dividers?number=10")
    public int Dividers(@PathVariable("number") int num){
        return service.getDividers(num);
}
    @GetMapping("user/name/surname/age")
    public User User(@PathVariable String name, @PathVariable String name2, @PathVariable int age){
        User u = new User(name, name2, age);
        return u;
    }
}

