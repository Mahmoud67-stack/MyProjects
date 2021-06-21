package SoftwareDesign.HW3;

public class Spell {
    void Expelliarmus(String death_eater)
    {
        System.out.println(death_eater + " is now disarmed from his weapon, and you attacked him");
    }

    void Stupefy(String death_eater)
    {
        System.out.println(death_eater+" is now stunned, and you attacked him");
    }

    void Protego(String death_eater)
    {
        System.out.println(" You protected your self from "+ death_eater +"'s attack using an invisible shield, and you attacked him back");
    }

    void Expecto_Patronum(String death_eater)
    {
        System.out.println("You protected your self from the dark magic of "+death_eater+", and you attacked him back");
    }
}
