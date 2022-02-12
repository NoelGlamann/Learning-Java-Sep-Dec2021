package edu.neumont;

public class Product{
    public Product(String name, double price, eType type){
        this.name = name;
        this.price = price;
        this.type = type;
    }
    //7-2 Enum
    enum eType{
        Undefined,
        Book,
        Electronics,
        Food,
        Entertainment,
        Clothes_Shoes
    };

    private String name;
    private double price;
    private eType type = eType.Undefined;
    //8-1 (Final Variables)
    private final static double TAX = 0.085;
    private final static double MIN_PRICE = 0;
    private final static double MAX_PRICE = 1000;

    public eType getType() {
        return type;
    }
    public void setType(eType type){
        this.type = type;
    }

    public Product() {
    }

    public Product(String name) {
        this.name = name;
    }
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

    //7-3 (Method Overloading)
    public void setPrice(double price){
        //8-2 Throw Exception
        try{
            if(price<MIN_PRICE || price>MAX_PRICE){
                throw new IllegalArgumentException("Price (" + price + ") is not allowed");
            }
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        this.price = price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public void setPrice(String price){
        //8-3 (Exceptions)
        try{
            this.price = Double.parseDouble(price);
        }catch (NumberFormatException e){
            System.out.println("Number Format Issue " + e.getMessage());
        }catch (Exception e){
            System.out.println("exception: " + e.getMessage());
        }
    }

    private double getTax() {
        return price * TAX;
    }

    public double getTotal(){
        return price + getTax();
    }

    public void display(){
        System.out.println("name: " + name);
        System.out.println("price: $" + price);
    }
}
