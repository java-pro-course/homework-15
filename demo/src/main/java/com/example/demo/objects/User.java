package com.example.demo.objects;

public class User {
    private String name;
    private String surname;
    private int age;
    public User(String name, String surname, int age){
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
