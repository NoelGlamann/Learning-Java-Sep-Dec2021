//Noel Glamann
//October 21, 2021
//Pizza Party Assignment (2-3)

package edu.neumont;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        double price = CalculatePizzaPrice("pepperoni", "onion");
        System.out.println("Pizza: $" + String.format("%.2f", price));

        int i = 5;
        int j = 9;
        display(999, 999);
    }

    static void display(int n){
        System.out.println(n);
    }

    static void display(int n1, int n2){
        System.out.println(n1 * n2);
    }

    static void display(double n){
        System.out.println(n);
    }


    static double CalculatePizzaPrice(String topping1, String topping2){
        double price = 5.0;

        price += getToppingPrice(topping1);
        price += getToppingPrice(topping2);

        return price;
    }
    static double getToppingPrice (String topping){
        if (topping.equals("pepperoni")) {
            return 2.5;
        }
        else if (topping.equals("sausage")) {
            return 3.25;
        }
        else if (topping.equals("onion")) {
            return 1;
        }
        else if (topping.equals("pepper")) {
            return 1.75;
        }
        else{
            return 0.0;
        }
    }
}
