package edu.nyu.cs.designpatterns.chapter05.classic;

public class Singleton {
    private static Singleton uniqueInstance;
    
    // other useful instance variables here
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
    
    // other useful methods here
    
}
