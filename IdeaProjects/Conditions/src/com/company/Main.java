package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner ageScan = new Scanner(System.in);
        System.out.println("Age: ");
        int age = ageScan.nextInt();
        if (age >= 65){
            System.out.println("You're a senior.");
        }
        else if (age >= 18){
            System.out.println("You're an adult.");
        }
        else {
            System.out.println("You're a child.");
        }

        Scanner gradeScan = new Scanner(System.in);
        System.out.println("What is your grade in Intro to CS? (A, B, C, D, F) ");
        char grade = gradeScan.nextLine().charAt(0);
        grade = Character.toUpperCase(grade);
        switch (grade) {
            case 'A':
                System.out.println("Fantastic");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Poor");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade");
        }


    }
}
