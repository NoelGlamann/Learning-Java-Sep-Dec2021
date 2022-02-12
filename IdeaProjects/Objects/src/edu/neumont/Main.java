//Noel Glamann
//October 18, 2021
//Random Number Generating GUI

package edu.neumont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int min = Integer.parseInt(s);
        s = scanner.nextLine();
        int max = Integer.parseInt(s);

        enum Type{
            CAR,
            MOTORCYCLE,
            BOAT
        }

        Type carType;
        carType = Type.MOTORCYCLE;

        switch(carType){
            case CAR:
                System.out.println("Car");
                break;
            case MOTORCYCLE:
                System.out.println("Moto");
                break;
            case BOAT:
                System.out.println("boat");
                break;
        }

        System.out.println(add(2, 4));

        print("noel");

        System.out.println(sqr(3));

    }//main function

    //makes the function able to be called = static
    //what the function is returning = int
    //function name = add
    //parameters = n1, n2 with declaration of type
    static int add(int n1, int n2){
        return n1 + n2;
    }

    static void print(String string){
        System.out.println(string);
    }

    static double sqr(double num){
        return num * num;
    }

}//Main class
