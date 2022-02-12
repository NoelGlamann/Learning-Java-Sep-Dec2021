package edu.neumont;

public class Main {

    public static void main(String[] args) {

        Game game = new Game();

        int i1 = 40;
        int i2 = 10;
//        try / catch
        try{
            int result = i1/i2;
            System.out.println(result);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        String[] names = {"Rosy", "Noel", "Ryan", "Eric"};

        try{
        System.out.println(names[1]);
        }
        catch (IndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }



    }
}
