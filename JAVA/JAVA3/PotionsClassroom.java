package SoftwareDesign.HW3;

import java.util.Scanner;

public class PotionsClassroom extends HogwardsRoom {
    Player player;

    PotionsClassroom(Player player) {
        super("Potions Classroom", "East", "Professor Snape", player);
        System.out.println("You have entered the Potions Classroom");
        this.player = player;

        Scanner obj = new Scanner(System.in);

        String c = obj.nextLine();

        while (!(c.contains("look") || c.contains("Look"))) {
            System.out.println("Invalid option please try again..");
            c = obj.nextLine();
        }
        map();

    }

    @Override
    void make_potions() {
        System.out.println("You saved yourself…now you can now use the cauldron and ingredients to make the\n" +
                "Polyjuice potion or the invisibility potion to proceed without anyone recognizing you…");
        Scanner obj = new Scanner(System.in);
        boolean validchoice = false;
        while (!validchoice) {
            String c = obj.nextLine();
            if(c.startsWith("make")) {

                String potion = c.substring(5);
                if (potion.equals("Polyjuice potion")) {
                    if (player.poly_pot == false) {


                        new Polyjuice().preparePotion("fluxweed and lacewings", "4 times clockwise", "high");
                        player.poly_pot = true;
                    } else {
                        System.out.println("You already have a Polyjuice potion");
                    }
                } else if (potion.equals("Invisibility potion")) {

                    if (player.invis_pot == false) {
                        new Invisibility().preparePotion("cherries and spiders", "3 times anticlockwise", "high");
                        player.invis_pot = true;
                    } else {
                        System.out.println("You already have an Invisible potion");
                    }
                } else {
                    System.out.println("Invalid option try again: ");
                }
            } else
            {
                System.out.println("Invalid option try again: ");
            }
            if(player.poly_pot && player.invis_pot){
                validchoice = true;
            }

        }
    }

    @Override
    void look() {
        System.out.println("Potions is one of the core subjects that first year students are required to study. In the\n" +
                "potions class there is Professor Snape who teaches the subject. He does not seem very happy\n" +
                "to see you and starts attacking you!");
    }

    @Override
    void next() {

        System.out.println("Where to next (Library west or Dining Hall north): ");
        Scanner obj = new Scanner(System.in);
        boolean validchoice = false;
        while (!validchoice) {
            String c = obj.nextLine();
            if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                validchoice = true;
                System.out.println("Leaving the room...");
                player.setLocation("Library");
                new Library(player);
            } else if (c.contains("Dining") || c.contains("dining") || c.contains("north") || c.contains("North")) {
                validchoice = true;
                System.out.println("Leaving the room...");
                player.setLocation("Dining Hall");
                new DiningHall(player);
            } else {
                System.out.println("Invalid option please try again:");
            }

        }

    }
}
