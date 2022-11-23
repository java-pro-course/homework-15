package com.kalamya.task4.object;


public class UserObject {
    private String Name;
    private String SName;
    private int age;
    public UserObject(String Name, String SName, int age){
        this.Name = Name;
        this.SName = SName;
        this.age = age;
    }

    public void getInfo(){
        getName();
        getSName();
        getAge();
    }
    public String getName(){
        return this.Name;
    }
    public String getSName(){
        return this.SName;
    }
    public Integer getAge(){
        return this.age;
    }
}
