package edu.neumont;

public class Helper {
    static int add(int n1, int n2){
        return n1 + n2;
    }
    static int subtract(int n1, int n2){
        return n1 - n2;
    }
    static int multiply(int n1, int n2){
        return n1 * n2;
    }
    static int divide(int n1, int n2){
        if (n2==0){return -1;}
        else{return n1 / n2;}
    }
    static int modulus(int n1, int n2){
        if (n2==0){return n1;}
        else{return n1 % n2;}
    }
}
