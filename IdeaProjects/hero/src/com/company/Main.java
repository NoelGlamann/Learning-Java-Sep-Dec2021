package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Hero Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Power Level: ");
        int pwrLvl = scanner.nextInt();
        System.out.print("Enter Critical Hit: ");
        float odds2win = scanner.nextFloat();

        System.out.println("Name: " + name);
        System.out.println("Power Level: " + pwrLvl);
        System.out.println("Chances of Winning: " + odds2win);



    }
}
