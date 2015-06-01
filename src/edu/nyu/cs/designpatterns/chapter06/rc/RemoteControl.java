package edu.nyu.cs.designpatterns.chapter06.rc;

public class RemoteControl {
    private Command[] onCommands;
    private Command[] offCommands;
    private Command undoCommand;
    
    public RemoteControl(int numberOfSlots) {
        if (numberOfSlots < 1) {
            throw new IllegalArgumentException("Must have at least 1 slot");
        }
        
        this.onCommands = new Command[numberOfSlots];
        this.offCommands = new Command[numberOfSlots];
        Command noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            this.onCommands[i] = noCommand;
            this.offCommands[i] = noCommand;
        }
        this.undoCommand = noCommand;
    }
    
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        int n = Math.min(onCommands.length, offCommands.length);
        if (slot < 0 || slot >= n) {
            throw new IllegalArgumentException("The slot number could not exceed " + n);
        }
        
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }
    
    public void onButtonWasPushed(int slot) {
        if (slot < 0 || slot >= onCommands.length) {
            throw new IllegalArgumentException("The slot number could not exceed " + onCommands.length);
        }
        
        onCommands[slot].execute();
        undoCommand = onCommands[slot];
    }
    
    public void offButtonWasPushed(int slot) {
        if (slot < 0 || slot >= offCommands.length) {
            throw new IllegalArgumentException("The slot number could not exceed " + offCommands.length);
        }
        
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }
    
    public void undoButtonWasPushed() {
        undoCommand.undo();
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\n------ Remote Control ------\n");
        for (int i = 0; i < onCommands.length; i++) {
            sb.append("[slot " + i + "] " + onCommands[i].getClass().getName()
                    + "     " + offCommands[i].getClass().getName() + "\n");
        }
        sb.append("[undo] " + undoCommand.getClass().getName() + "\n");
        return sb.toString();
    }

}
