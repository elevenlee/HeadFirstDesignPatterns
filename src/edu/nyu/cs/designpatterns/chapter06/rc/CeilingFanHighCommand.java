package edu.nyu.cs.designpatterns.chapter06.rc;

import edu.nyu.cs.designpatterns.chapter06.rc.CeilingFan.Speed;

public class CeilingFanHighCommand implements Command {
    private final CeilingFan ceilingFan;
    private Speed prevSpeed;
    
    public CeilingFanHighCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.high();
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
