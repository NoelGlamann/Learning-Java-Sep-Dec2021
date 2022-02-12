package edu.neumont;

public class Main {

    public static void main(String[] args) {

        product product1 = new product("gummies", 7.89, 1.23);

        product1.display();

        System.out.println(product1.getShipping(product1.weight));


        /*
        for (String arg : args){
            System.out.println(arg);
        }
        System.out.println(args.length);
        for (int i = 0; i < args.length; i ++){
            System.out.println(args[i]);
        }
        String name = args[0];
        int num = Integer.parseInt(args[1]);
        boolean bool = Boolean.parseBoolean(args[2]);
        if (bool){
            for (int i = 0; i <num; i++){
                System.out.println(name + i);
            }
        }
        int i3 = 8;
        int i4 = 14;
        int max;
        max = (i3>i4) ? i3: i4;
        int number = 3;
        String message = (number%2 == 0) ? "even": "odd";
        System.out.println(max + message);*/

    }
}
