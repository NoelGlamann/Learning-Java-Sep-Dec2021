package edu.neumont;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
        /*System.out.println("enter iterations: ");
        int iterations = Integer.parseInt(scanner.nextLine());

        String randos = "";
        for (int i = 0; i < iterations; i++){
            int r = getRandom(0, 200);
            randos += r + "\n";
        }

        System.out.println(randos);*/

        String[] words = {"darn", "dang", "shoot"};

        for (int i = 0; i < words.length; i++){
            System.out.println(words[i]);
        }

        for (String word : words
             ) {
            System.out.println(word);;
        }

        ArrayList<String> names = new ArrayList<>(Arrays.asList("Noel", "Caleb", "Shayla"));
        names.set(2, "Shiloh");
        for (int i = 0; i < names.size(); i++){
            System.out.println(names.get(i));
        }

        for (String name : names
        ) {
            System.out.println(name);;
        }

        System.out.print("enter search: ");
        String search = scanner.nextLine();

        boolean found = false;
        for (String n: names){
            if (n.equalsIgnoreCase(search)){
                found = true;
                break;
            }
        }
        if (found == true){
            System.out.println(search + " was found");
        }
        else{
            System.out.println(search + " was not found");
        }

    }

    static int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(min, max);
    }



}
