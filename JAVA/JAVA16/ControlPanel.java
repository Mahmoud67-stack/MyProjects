package SoftwareDesign.Project;

public class ControlPanel {
    Command [] slots;

    public ControlPanel(Command[] slots)
    {
        this.slots = slots;
    }

    public void ButtonWasPressed(int index)
    {
        slots[index].execute();
    }
}
