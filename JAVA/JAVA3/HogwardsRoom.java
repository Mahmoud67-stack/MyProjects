package SoftwareDesign.HW3;

import java.util.Scanner;

public abstract class HogwardsRoom {

    String Placename, location, death_eater;

    Player player;

    HogwardsRoom(String Placename, String location, String death_eater, Player player) {
        this.location = location;
        this.Placename = Placename;
        this.death_eater = death_eater;
        this.player = player;
    }
    final void map()
    {
        look();
        fight();
        make_potions();
        next();
    }
    void fight()
    {
        if(Placename.equals("Library") && !player.invis_pot && !player.poly_pot)
        {
            System.out.println("You do not have the two potions with you so you cannot fight Draco Malfoy\n" +
                    "Go to the Potions Classroom to get the potions.");
        }
        else {
            Scanner obj = new Scanner(System.in);

            String choice = "";

            boolean valid_choice = false;

            while (!valid_choice) {
                choice = obj.nextLine();
                if (choice.equals("Expelliarmus") || choice.equals("expelliarmus")) {
                    valid_choice = true;
                    player.p.spellWasCasted(2, death_eater);
                } else if (choice.equals("Protego") || choice.equals("protego")) {
                    valid_choice = true;
                    player.p.spellWasCasted(3, death_eater);
                } else if (choice.equals("Stupefy") || choice.equals("stupefy")) {
                    valid_choice = true;
                    player.p.spellWasCasted(0, death_eater);
                } else if (choice.equals("Expecto Patronum") || choice.equals("expecto patronum")) {
                    valid_choice = true;
                    player.p.spellWasCasted(1, death_eater);
                } else {
                    System.out.println("invalid choice");
                }
            }
        }
    }
    abstract void look();

    abstract void make_potions();

    abstract void next();
}
