package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //loops practice

        Scanner scanner = new Scanner(System.in);

//        for (int i = 10; i < 0; i--) {
//            System.out.println("i will not tell lies " + i);
//        }

        Random random = new Random();
        int answer = random.nextInt(1,5);
        int attempts = 3;

        while (attempts>0) {
            System.out.print("Guess a number from 1 - 5 -->");
            int guess = scanner.nextInt();
            if (guess == answer) {
                System.out.println("Your win! The answer was " + answer+"!");
                break;
            }
            else if (guess<answer) {
                attempts--;
                if(attempts ==0){
                    System.out.println("Nope:( Zero attempts remaining.");
                    break;
                }
                System.out.println("Too Low! Attempts remaining: " + attempts);
            }
            else if (guess>answer) {
                attempts--;
                if(attempts ==0){
                    System.out.println("Nope:( Zero attempts remaining.");
                    break;
                }
                System.out.println("Too High! Attempts remaining: " + attempts);
            }
        }
    }
}
