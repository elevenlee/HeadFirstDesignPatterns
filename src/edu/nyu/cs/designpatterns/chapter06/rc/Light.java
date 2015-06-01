package edu.nyu.cs.designpatterns.chapter06.rc;

public class Light {
    private final String location;
    
    public Light() {
        this("Unknown Location");
    }
    
    public Light(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " light is on");
    }
    
    public void off() {
        System.out.println(location + " light is off");
    }
    
}
