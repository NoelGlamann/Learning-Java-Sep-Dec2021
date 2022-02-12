package edu.neumont;

public class Character {
    String name;
    String type;
    double health;
    double strength;

//    static double deathValue = 0;

    void display(){
        System.out.println(name + " is a " + type + " with " + Console.display(health) + " health.");
    }

    void attack(Character enemy){
        double damage = strength * Math.random();
        enemy.health = enemy.health - damage;
        if (enemy.health <0){enemy.health = 0;}
        System.out.println(name + " did " + Console.display(damage) + " of damage to "+ enemy.name + ".");
    }

    boolean isAlive(){
        return health>0;
    }

}
