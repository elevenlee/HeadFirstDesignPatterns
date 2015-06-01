package edu.nyu.cs.designpatterns.chapter06.rc;

import edu.nyu.cs.designpatterns.chapter06.rc.CeilingFan.Speed;

public class CeilingFanOffCommand implements Command {
    private final CeilingFan ceilingFan;
    private Speed prevSpeed;
    
    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.off();
    }

    @Override
    public void undo() {
        switch (prevSpeed) {
            case OFF: 
                ceilingFan.off();
                return;
            case LOW:
                ceilingFan.low();
                return;
            case MEDIUM:
                ceilingFan.medium();
                return;
            case HIGH:
                ceilingFan.high();
                return;
        }
        throw new IllegalArgumentException("No such speed type " + prevSpeed);
    }

}
