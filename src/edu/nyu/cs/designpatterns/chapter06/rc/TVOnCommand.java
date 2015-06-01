package edu.nyu.cs.designpatterns.chapter06.rc;

public class TVOnCommand implements Command {
    private final TV tv;
    
    public TVOnCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.on();
    }

    @Override
    public void undo() {
        tv.off();
    }

}
