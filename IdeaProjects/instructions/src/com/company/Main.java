package com.company;

public class Main {

    public static void main(String[] args) {
	    int age = 23;
        //age++; //adds one
        //age = age + 1;
        //age += 1;
        System.out.println("Age: " + age);//
        drawLine();
        System.out.println(Math.random() * 100);
        System.out.println("sqr (7): " + sqr(7));
        System.out.println("7 times 3 = " + multiply(7,3));



    }

    public static void drawLine(){
        System.out.println("------------------------------------------");
    }
    static int sqr(int value){
        return value * value;
    }

    static int multiply(int first, int second){
        return first * second;
    }
}
