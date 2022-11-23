package com.kalamya.task4.api;


import com.kalamya.task4.object.UserObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @GetMapping("user/{name}/{surname}/{age}")
    public UserObject infoUser(
            @PathVariable String name, @PathVariable String surname, @PathVariable int age){
        UserObject user = new UserObject(name, surname, age);
        return user;
    }


}

