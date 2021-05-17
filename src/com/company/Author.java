package com.company;

import java.util.Scanner;

public class Author {
    Scanner scanner = new Scanner(System.in);

    private String firstName;
    private String lastName;



    public Author(String firstName, String lastName) {
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName (String firstName){
        this.firstName = firstName;

    }

    public void setLastName (String lastName){
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void toPrint (){

        System.out.println(firstName);
        System.out.println(lastName);

    };

}
