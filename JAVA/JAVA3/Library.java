package SoftwareDesign.HW3;

import java.util.Scanner;

public class Library extends HogwardsRoom {
    Hermione hermione;

    Library(Player player) {
        super("Library", "West", "Draco Malfoy", player);
        System.out.println("You have entered the Library");
        hermione = new Hermione(player);
        Scanner obj  =  new Scanner(System.in);

        String c = obj.nextLine();

        while (!(c.contains("look") || c.contains("Look"))) {
            System.out.println("Invalid option please try again..");
            c = obj.nextLine();
        }
        map();
    }

    @Override
    void make_potions() {
        //Empty
    }

    @Override
    void look() {
        System.out.println("Books is one of the core sources of knowledge that first year students are required to study in.\n" +
                "In the potions class there is Draco Malfoy who is destroying the library. He seems very angry\n" +
                "to see you and starts attacking you!");
    }

    @Override
    void next() {
        if ( !(!player.invis_pot && !player.poly_pot)) {
            System.out.println("Found Hermione!");

            Scanner obj = new Scanner(System.in);

            while (!obj.nextLine().equals("mischief managed")) {
                System.out.println("Those are not the correct words to close the map try again: ");
            }
            System.out.println("Hiding map contents... end.");
            System.exit(1);
        }

        else
        {
            System.out.println("Where to next (Potions Classroom east or Dining Hall north): ");
            Scanner obj = new Scanner(System.in);
            boolean validchoice = false;
            while (!validchoice) {
                String c = obj.nextLine();
                if (c.contains("Potions") || c.contains("potions") || c.contains("east") || c.contains("East")) {
                    validchoice = true;
                    System.out.println("Leaving the room...");
                    player.setLocation("Potions Classroom");
                    new PotionsClassroom(player);
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
}

