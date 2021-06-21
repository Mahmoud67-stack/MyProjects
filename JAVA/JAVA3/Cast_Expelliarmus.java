package SoftwareDesign.HW3;

public class Cast_Expelliarmus implements Command {
    Spell spell;

    Cast_Expelliarmus(Spell spell)
    {
        this.spell = spell;
    }

    @Override
    public void execute(String death_eater) {
        spell.Expelliarmus(death_eater);
    }
}
