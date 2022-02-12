package com.example.highroller;

import java.util.Random;

public class Die {

    public static int Roll(){
        Random random = new Random();
        return (random.nextInt(6) + 1);
    }
}
