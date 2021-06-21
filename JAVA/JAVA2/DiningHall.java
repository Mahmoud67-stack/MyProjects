package SoftwareDesign.HW2;

public class DiningHall extends HogwardsRoom {

    Harry harry;

    DiningHall(Harry harry, UserInterface UI) {
        super("DiningHall", "North", UI);
        this.harry = harry;
        UI.write("The Dining Hall is biggest open area inside Hogwarts. Professor\n" +
                "Dumbledore is here.");

        String c = UI.read();

        while (!(c.contains("exit") || c.contains("Exit"))) {
            System.out.println("Invalid option please try again..");
            c = UI.read();
        }
        next();
    }

    @Override
    void next() {
        UI.write("Leaving the room...enter a new direction");
        UI.write("Were to next (Library west or Potions Classroom east): ");
        boolean validchoice = false;
        while (!validchoice) {
            String c = UI.read();
            if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                validchoice = true;
                harry.setLocation("Library");
                Library library = new Library(harry, UI);
            } else if (c.contains("Potions") || c.contains("potions") || c.contains("east") || c.contains("East")) {
                validchoice = true;
                harry.setLocation("Potions Classroom");
                PotionsClassroom potionsclassroom = new PotionsClassroom(harry, UI);
            } else {
                System.out.println("Invalid option please try again:");
            }
        }
    }

}
