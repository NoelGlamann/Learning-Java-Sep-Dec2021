package edu.neumont;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Console.displayLine();
        Console.number = 12;
        System.out.println(Console.number);
        Console.displayLine();

        Character player = new Character();
        player.name = "Noel";
        player.type = "Human";
        player.strength = 80;
        player.health = 100;

        Character enemy = new Character();
        enemy.name = "Spy";
        enemy.type = "wizard";
        enemy.strength = 48;
        enemy.health = 100;

        player.display();
        enemy.display();
        Console.displayLine();

        while (enemy.isAlive() && player.isAlive()){
            player.attack(enemy);
            enemy.display();
            enemy.attack(player);
            player.display();
            Console.displayLine();
        }
        if (enemy.isAlive()){
            System.out.println(enemy.name + " is the winner:(");
        }
        else if (player.isAlive()){
            System.out.println(player.name + " is the winner! :)");
        }
        else{
            System.out.println("... huh?");
        }

    }
}
