package edu.neumont;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Product p1 = new Product("xbox", 499, Product.eType.Electronics);
        p1.setPrice("a.99");

        Wishlist list1 = new Wishlist();
        list1.add(p1);
        list1.add(new Product("ps5", 599, Product.eType.Electronics));
        list1.display();
//7-1 (Create an Array of Objects)
        Wishlist list2 = new Wishlist();
        list2.add(new Product("amazon gift card", 20, Product.eType.Undefined));
        list2.add(new Product("friends sweatshirt", 49.0, Product.eType.Clothes_Shoes));
        list2.display(Product.eType.Clothes_Shoes);
    }
}
