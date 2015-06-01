package edu.nyu.cs.designpatterns.chapter06.rc;

public class SimpleCommandControl {
    private Command command;
    
    public SimpleCommandControl() {}
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void buttonWasPressed() {
        command.execute();
    }

}
