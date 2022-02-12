//Noel Glamann
//Mad Libs 2.0

package edu.neumont;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MadLib madlib = new MadLib();
        System.out.print("Noun: ");
        madlib.noun = scanner.nextLine();
        System.out.print("Adjective: ");
        madlib.adjective = scanner.nextLine();
        System.out.print("Number: ");
        String string = scanner.nextLine();
        madlib.number = Integer.parseInt(string);

        madlib.display();
    }
}