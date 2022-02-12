//Noel Glamann
//October 19, 2021
//Exercise 3-1

package edu.neumont;

public class Main {

    public static void main(String[] args) {
        Cars[] cars = new Cars[3];
        cars[0] = new Cars(4, 34.7, "Ford");
        cars[1] = new Cars(4, 28.9, "Nissan");
        cars[2] = new Cars(2, 12.6, "Chevrolet");

        for (int i = 0; i < cars.length; i++){
            cars[i].display();
        }

    }
}
