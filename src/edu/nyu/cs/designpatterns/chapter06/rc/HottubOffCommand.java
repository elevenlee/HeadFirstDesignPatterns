package edu.nyu.cs.designpatterns.chapter06.rc;

public class HottubOffCommand implements Command {
    private final Hottub hottub;
    
    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.off();
    }

    @Override
    public void undo() {
        hottub.on();
    }

}
