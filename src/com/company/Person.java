package com.company;

public class Person {

    private String lastName;
    private String firstName;

    public void Person(String lastName, String firstName){
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public String getFirstName(){
        return firstName;
    }

}
