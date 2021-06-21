package SoftwareDesign.LAB11.Question1;

public class ControlPanel {
    Command [] slots;
    Command undocommand = null;
    public ControlPanel(Command [] slots) {
        this.slots = slots;
    }
    public void buttonWasPressed(int index){
        slots[index].execute();
        undocommand = slots[index];
    }
    public void undo() {
        if(undocommand!=null)
            undocommand.undo();
    }
}
