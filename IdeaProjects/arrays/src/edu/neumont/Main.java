package edu.neumont;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {23, 5, 9, -18, 1};;// = new int[5];
//        nums[5] = 22;
//
//        System.out.println(nums);//prints out the memory locataion
//        System.out.println(nums[4]);//remember it starts at zero
//
//        for (int i = 0; i < nums.length; i++){
//            System.out.println(nums[i]);
//        }

        Scanner scanner = new Scanner(System.in);

        boolean[] seats = new boolean[10];
        boolean quit = false;

        while (quit == false) {
            System.out.print("enter command: ");
            char command = scanner.nextLine().charAt(0);
            command = Character.toUpperCase(command);
            if (command == 'Q'){
                quit = true;
            }
            else if (command =='B'){
                for (int i = 0; i<seats.length; i++){
                    if (seats[i] == true) {
                        System.out.print("X ");
                    }
                    else {
                        System.out.print((i+1)+" ");
                    }
                }
                System.out.println();
                System.out.print("enter seat number: ");
                String string = scanner.nextLine();
                int seatNum = Integer.parseInt(string);
                if (seats[seatNum-1] == false) {
                    seats[seatNum-1] = true;
                    System.out.println("Seat "+seatNum+" has been purchased.");
                    displayTotal(seats);
                    line();
                }
                else{
                    System.out.println("Seat "+seatNum+" is not available.");
                    displayTotal(seats);
                    line();
                }
            }
            else if (command == 'T'){
              displayTotal(seats);
              line();
            }

        }

    }
    static void displayTotal(boolean[] seats) {
        int count = 0;
        for (int i = 0; i < seats.length; i++){
            if (seats[i] == true){count ++;};
        }
        System.out.println("Tickets sold: "+count);
        System.out.println("Seats available: "+ (seats.length - count));
    }
    static void line(){
        System.out.println("________________________________________");
    }
}
