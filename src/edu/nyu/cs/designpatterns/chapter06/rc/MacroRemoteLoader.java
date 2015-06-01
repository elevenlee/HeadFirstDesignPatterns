package edu.nyu.cs.designpatterns.chapter06.rc;

public class MacroRemoteLoader {

    public static void main(String[] args) {
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();
        
        LightOnCommand lightOn = new LightOnCommand(light);
        TVOnCommand tvOn = new TVOnCommand(tv);
        StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        
        LightOffCommand lightOff = new LightOffCommand(light);
        TVOffCommand tvOff = new TVOffCommand(tv);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);
        
        Command[] partyOn = {lightOn, tvOn, stereoOn, hottubOn};
        Command[] partyOff = {lightOff, tvOff, stereoOff, hottubOff};
        Command partyOnMarco = new MacroCommand(partyOn);
        Command partyOffMarco = new MacroCommand(partyOff);
        
        RemoteControl remoteControl = new RemoteControl(7);
        remoteControl.setCommand(0, partyOnMarco, partyOffMarco);
        
        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
    
}
