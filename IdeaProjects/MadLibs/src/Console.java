package edu.neumont;

public class Console {


    public static void displayLine(){
        System.out.println("_________________________________");
    }

    static String display(double value){
        return String.format("%.1f", value);
    }

}