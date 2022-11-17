package com.company.exapmle.API;

import com.company.exapmle.Objects.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("user/{name}/{surname}/{age}")
    public User getUser(@PathVariable String name, @PathVariable String surname,@PathVariable int age){
        return new User(name, surname, age);
    }
}
