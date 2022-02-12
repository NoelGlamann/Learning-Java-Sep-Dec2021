package edu.neumont;

public class Account {
    private String name;
    double balance;

    Account(){
        name = "none";
        balance = 0;
    }

    Account(String _name, double _balance){
        name = _name;
        balance = _balance;
    }

    Account(String _name){
        name = _name;
        balance = 0;
    }

    public String getName(){
        return name;
    }

    public double getBalance(){
        return balance;
    }

    void setBalance(double balance){
        this.balance = balance;
    }

}
