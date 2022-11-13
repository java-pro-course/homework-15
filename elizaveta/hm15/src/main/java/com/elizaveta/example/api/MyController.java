package com.elizaveta.example.api;
import com.elizaveta.example.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MyController {

    @GetMapping("multiply/{firstNumber}/{secondNumber}")
    public int  multiply(@PathVariable int firstNumber, @PathVariable int secondNumber){
        return  firstNumber*secondNumber;
    }

    @GetMapping("dividers")
    public List  dividers(@RequestParam("number") int number){
        List list = new ArrayList();
        for(int i=number; i>0; i--) {
            int b = number % i;
            if (b == 0)
                list.add(i);

        }
        return list;
    }
    @GetMapping("string/{str}")
    public List  string(@PathVariable String str){
        List list = new ArrayList();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        return list ;
    }

    @GetMapping("user/{name}/{surname}/{age}")
    public User  getUser(@PathVariable String name, @PathVariable String surname, @PathVariable int age){
        User usr = new User(name, surname, age);
        return  usr;
    }

}
