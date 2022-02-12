package com.example.uml;

public class StudentStats {
    String name;
    int age;
    boolean isFemale;


    public String getInfo(){
        return "Name: " + name +"\nAge: " + age + "\nIs female: " + (isFemale ? "Yes" : "No");

    }

    public String Birthday(){
        age +=1;
        return "Age: " + age;
    }
}
