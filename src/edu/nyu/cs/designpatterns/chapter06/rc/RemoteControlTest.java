package edu.nyu.cs.designpatterns.chapter06.rc;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleCommandControl remote = new SimpleCommandControl();
        Light light = new Light();
        GarageDoor garageDoor = new GarageDoor();
        LightOnCommand lightOn = new LightOnCommand(light);
        GarageDoorUpCommand garageOpen = new GarageDoorUpCommand(garageDoor);
        
        remote.setCommand(lightOn);
        remote.buttonWasPressed();
        remote.setCommand(garageOpen);
        remote.buttonWasPressed();
    }

}
