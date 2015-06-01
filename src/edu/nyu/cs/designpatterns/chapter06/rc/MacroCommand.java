package edu.nyu.cs.designpatterns.chapter06.rc;

public class MacroCommand implements Command {
    private final Command[] commands;
    
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (Command c : commands) {
            c.execute();
        }
    }

    @Override
    public void undo() {
        for (Command c : commands) {
            c.undo();
        }
    }

}
