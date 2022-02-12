public class Program {
    public static void main(String[] args) {
        //printing to console
        //literal data type is the literal assignment of a string or value.
        //System.out.println("Hello");

        //practicing data types

        //byte
        byte lives = 127;
        //short
        short health =32767;
        //double
        double savings = 2134153;
        //long
        long potato = 2000000000;

        //conversion between the types
        health = lives;

        //integer **if you need a number bigger than 2 billion use a long
        int count = -16;
        //float (add the f to know it's a single float)
        float price = 16.89f;

        int iprice = price;

        //boolean
        boolean isDead = false;
        //character
        char midInitial = 'G';



        //string - NOT primitive
        String name = "Evan";
        String fact ="He loves to play Monopoly";
        System.out.println(name);
        System.out.println(fact);

        //char num associated with ascii code,
        // the slash is the char for 47
        char test = 47;


    }
}