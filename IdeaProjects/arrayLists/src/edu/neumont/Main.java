package edu.neumont;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    int[] ages = {12, 15, 19, 20};
        for (int age: ages){
            System.out.println(age);
        }

        String[] names = {"Nick", "Brendan", "Noel", "Shayla"};
        for (String name: names){
            System.out.println(name);
        }

        ArrayList<String> movies = new ArrayList<String>();
        movies.add("The Grinch");
        movies.add("Elf");
        movies.add("Nightmare Before Christmas");
        System.out.println(movies);

        movies.remove(2);
        movies.set(0, "How the Grinch Stole Christmas");
        for (String movie: movies){
            System.out.println(movie);
        }

/*
        movies.clear();
        System.out.println(movies);
*/

        for(int n = 0; n<movies.size(); n++){
            System.out.println(movies.get(n));
        }
    }
}
