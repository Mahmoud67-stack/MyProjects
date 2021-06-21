package SoftwareDesign.HW3;

public class ControlPanel {
    Command [] slots;

    public ControlPanel(Command[] slots)
    {
        this.slots = slots;
    }

    public void spellWasCasted(int index, String death_eater)
    {
        slots[index].execute(death_eater);
    }
}
