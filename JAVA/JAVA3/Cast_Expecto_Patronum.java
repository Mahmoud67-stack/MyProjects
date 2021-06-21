package SoftwareDesign.HW3;

public class Cast_Expecto_Patronum implements Command {
    Spell spell;

    Cast_Expecto_Patronum(Spell spell)
    {
        this.spell = spell;
    }

    @Override
    public void execute(String death_eater) {
        spell.Expecto_Patronum(death_eater);
    }
}
