package SoftwareDesign.HW3;

import java.util.Scanner;

public class DiningHall extends HogwardsRoom {


    DiningHall(Player player) {
        super("DiningHall", "North", "Bellatrix Lestrange", player);
        System.out.println("You have entered the Dining Hall");
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
    }

    @Override
    void look() {
        System.out.println("The dining hall is the biggest open area inside Hogwarts. Bellatrix Lestrange is here,\n" +
                "get ready to fight!");
    }

    @Override
    void next() {
        System.out.println("Were to next (Library west or Potions Classroom east): ");
        boolean validchoice = false;
        Scanner obj  = new Scanner(System.in);
        while (!validchoice) {
            String c = obj.nextLine();
            if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                validchoice = true;
                player.setLocation("Library");
                System.out.println("Leaving the room...");
                new Library(player);
            } else if (c.contains("Potions") || c.contains("potions") || c.contains("east") || c.contains("East")) {
                validchoice = true;
                player.setLocation("Potions Classroom");
                System.out.println("Leaving the room...");
                new PotionsClassroom(player);
            } else {
                System.out.println("Invalid option please try again:");
            }
        }
    }

}
