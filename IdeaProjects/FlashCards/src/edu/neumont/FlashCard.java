package edu.neumont;

import java.util.Random;

public class FlashCard {
    int operand1;
    int operand2;
    int answer;
    int tries;

    static int GetRandom(int min, int max) {
        Random random = new Random();
        return random.nextInt(min, max);
    }

    void generate(){
        operand1 = GetRandom(1, 10);
        operand2 = GetRandom(1, 10);
        answer = operand1 + operand2;
    }

    void reset(){
        generate();
        resetTries();
    }

    void resetTries(){
        tries = 3;
    }
}

