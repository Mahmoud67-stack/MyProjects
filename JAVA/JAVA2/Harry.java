package SoftwareDesign.HW2;


public class Harry extends Character {
    Watch watch;

    Harry(UserInterface UI) {
        super("Harry", 18, "Entrance", UI);
        watch = new Watch(UI);

        System.out.println("Welcome to the Entrance of the school of wizards Hogwarts! ." +
                "\n\nYou are now at the doors of Hogwarts. The door on the north leads to \n" +
                "the dining hall, the door to the east leads to the Potions classroom, and\n" +
                "the door to the west leads to the Library.\n");

        boolean validchoice = false; // a flag or boolean to check the validity of the options

        String exit = "mischief managed"; // Exit phrase

        UI.write("So were you want to go: ");

        String c = UI.read();

        while (!validchoice) {
            if (c.contains("Dining") || c.contains("dining") || c.contains("north") || c.contains("North")) {
                setLocation("Dining");
                DiningHall diningHall = new DiningHall(this, UI);
                validchoice = true;
            } else if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                setLocation("Library");
                Library library = new Library(this, UI);
                validchoice = true;
            } else if (c.contains("Potions") || c.contains("potions") || c.contains("east") || c.contains("East")) {
                setLocation("Potions");
                PotionsClassroom potionsclassroom = new PotionsClassroom(this, UI);
                validchoice = true;
            } else if (c.equals(exit)) {
                validchoice = true;
            } else {
                System.out.println("Invalid option please try again:");
                System.out.println();
                System.out.println("So were you want to go: ");
                c = UI.read();
            }
            t = new Thread(this);
            t.start();
        }
    }

    public synchronized void setLocation(String location) {
        this.location = location;
    }

    public synchronized String getLocation() {
        return location;
    }

    @Override
    public void run() {
        while (true) {
            if (getLocation().equals("Library")) {
                UI.write("Found Hermione!");
                if (UI.read().equals("Mischief managed")) {
                    UI.write("Hiding map contents... end.");
                    System.exit(1);
                }

            } else if (watch.x) {
                String chief = UI.read();
                if (chief.equals("Mischief managed")) {
                    UI.write("You close the map and you are lost you fail to find hermione");
                }
            }
            System.exit(1);
        }
    }
}
