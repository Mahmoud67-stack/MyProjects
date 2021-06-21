package SoftwareDesign.HW3;

public class Cast_Stupefy implements Command{
    Spell spell;

    Cast_Stupefy(Spell spell)
    {
        this.spell = spell;
    }

    @Override
    public void execute(String death_eater) {
        spell.Stupefy(death_eater);
    }
}
