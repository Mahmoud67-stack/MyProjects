package SoftwareDesign.HW2;

public class PotionsClassroom extends HogwardsRoom {
    Harry harry;

    PotionsClassroom(Harry harry, UserInterface UI) {
        super("Potions Classroom", "East", UI);
        this.harry = harry;
        UI.write("The Potions Classroom is one of the core subjects that first year\n" +
                "students are required to study. Professor Snape is here.");

        String c = UI.read();

        while (!(c.contains("exit") || c.contains("Exit"))) {
            UI.write("Invalid option please try again..");
            c = UI.read();
        }
        next();
    }

    @Override
    void next() {
        System.out.println("Leaving the room...enter a new direction");
        System.out.println("Were to next (Library west or Dining Hall north): ");
        boolean validchoice = false;
        while (!validchoice) {
            String c = UI.read();
            if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                validchoice = true;
                harry.setLocation("Library");
                Library library = new Library(harry, UI);
            } else if (c.contains("Dining") || c.contains("dining") || c.contains("east") || c.contains("East")) {
                validchoice = true;
                harry.setLocation("Dining Hall");
                DiningHall dining = new DiningHall(harry, UI);
            } else {
                System.out.println("Invalid option please try again:");
            }
        }

    }
}
