package edu.nyu.cs.designpatterns.chapter06.rc;

public class GarageDoorUpCommand implements Command {
    private final GarageDoor garageDoor;
    
    public GarageDoorUpCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }

}
