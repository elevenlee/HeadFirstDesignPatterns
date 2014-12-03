package edu.nyu.cs.designpatterns.chapter05.dcl;

public class Singleton {
    private volatile static Singleton uniqueInstance;
    
    // other useful instance variables here
    
    private Singleton() {}
    
    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized(Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }
    
    // other useful methods here
    
}
