package edu.neumont;

import java.util.Random;

public class Count {

    public int tries = 3;

    public static int getRandom(){
        Random random = new Random();
        return random.nextInt(1, 7);
    }

}
