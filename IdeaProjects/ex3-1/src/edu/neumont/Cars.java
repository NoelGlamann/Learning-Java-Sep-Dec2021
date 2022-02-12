package edu.neumont;

public class Cars {
    int doors;
    double mpg;
    String model;

//    Cars() {
//        System.out.println("constructor");
//    }
    Cars( int _doors, double _mpg, String _model){
        doors = _doors;
        mpg = _mpg;
        model = _model;
    }

    void display(){
        System.out.println(doors);
        System.out.println(mpg);
        System.out.println(model);
    }


}
