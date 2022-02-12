package edu.neumont;

public class MadLib {
    String noun;
    String adjective;
    int number;

    void display(){
        String result = "";
        result += "On halloween, a boy dressed up as a " + adjective + noun + ". He scared "+ number +" people.";
        System.out.println(result);
    }

}
