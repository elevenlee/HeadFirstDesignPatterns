package edu.nyu.cs.designpatterns.chapter05.chocolate;

public class ChocolateController {

    public static void main(String[] args) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.drain();
        boiler.boil();
        
        // will return the existing instance
        @SuppressWarnings("unused")
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
    }

}
