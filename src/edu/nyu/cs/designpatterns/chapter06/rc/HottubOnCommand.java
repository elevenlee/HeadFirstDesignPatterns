package edu.nyu.cs.designpatterns.chapter06.rc;

public class HottubOnCommand implements Command {
    private final Hottub hottub;
    
    public HottubOnCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.on();
    }

    @Override
    public void undo() {
        hottub.off();
    }

}
