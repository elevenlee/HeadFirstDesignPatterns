package edu.nyu.cs.designpatterns.chapter05.stat;

public class Singleton {
    private static Singleton uniqueInstance = new Singleton();
    
    // other useful instance variables here
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        return uniqueInstance;
    }
    
    // other useful methods here
    
}
