package com.koritskiy.example.api;

import com.koritskiy.example.objects.UserObject;
import com.koritskiy.example.service.FirstService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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

    @GetMapping("user")
    public UserObject getUser() {
        UserObject user = new UserObject("Alexander", "Koritskiy", 21);
        return user;
    }

    @GetMapping("sum/{firstNumber}/{secondNumber}")
    public int sum(@PathVariable int firstNumber,
                   @PathVariable int secondNumber) {
        return firstNumber + secondNumber;
    }

    @GetMapping("calc")
    public int calculator(@RequestParam("firstNumber") int firstNumber,
                          @RequestParam("secondNumber") int secondNumber) {
        return service.calculate(firstNumber, secondNumber);
    }
}
