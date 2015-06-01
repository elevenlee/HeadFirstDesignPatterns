package edu.nyu.cs.designpatterns.chapter06.rc;

public class Stereo {
    private final String location;
    
    public Stereo(String location) {
        this.location = location;
    }
    
    public void on() {
        System.out.println(location + " stereo is on");
    }
    
    public void off() {
        System.out.println(location + " stereo is off");
    }
    
    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }
    
    public void setDvd() {
        System.out.println(location + " stereo is set for DVD input");
    }
    
    public void setRadio() {
        System.out.println(location + " stereo is set for Radio input");
    }
    
    public void setVolume(int volume) {
        System.out.println(location + " stereo volume set to " + volume);
    }
    
}
