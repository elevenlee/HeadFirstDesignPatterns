package edu.nyu.cs.designpatterns.chapter06.rc;

public class CeilingFan {
    private final String location;
    private Speed speed;
    
    public enum Speed {
        OFF(0),
        LOW(1),
        MEDIUM(2),
        HIGH(3);
        
        @SuppressWarnings("unused")
        private final int level;
        
        private Speed(int level) {
            this.level = level;
        }
    }
    
    public CeilingFan(String location) {
        this.location = location;
        this.speed = Speed.OFF;
    }
    
    public Speed getSpeed() {
        return speed;
    }
    
    public void high() {
        speed = Speed.HIGH;
        // code to set fan to high
    }
    
    public void medium() {
        speed = Speed.MEDIUM;
        // code to set fan to medium
    }
    
    public void low() {
        speed = Speed.LOW;
        // code to set fan to low
    }
    
    public void off() {
        speed = Speed.OFF;
        System.out.println(location + " ceiling fan is off");
        // code to set fan to off
    }
}
