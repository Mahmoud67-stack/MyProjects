package SoftwareDesign.HW3;

public class Cast_Protego implements Command{
    Spell spell;

    Cast_Protego(Spell spell)
    {
        this.spell = spell;
    }

    @Override
    public void execute(String death_eater) {
        spell.Protego(death_eater);
    }
}
