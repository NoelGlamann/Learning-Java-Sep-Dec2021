package edu.neumont;

public class product {
    String name;
    double price;
    double weight;
    static final double LG_PKG = 5.0;

    public product(String name, double price, double weight) {
        this.name = name;
        this.price = price;
        this.weight = weight;
    }

    void display(){
        System.out.println(name + " " + price + " " + weight);
    }

    double getShipping(double weight){
        return (weight>LG_PKG)? 10: 3;
    }
}
