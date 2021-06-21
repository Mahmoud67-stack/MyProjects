package SoftwareDesign.HW3;


import java.util.Scanner;

public class Player extends ConcreteSubject implements Runnable  {
    Watch watch;

    Spell spell;

    Command[] spells;

    ControlPanel p;

    String location;

    Thread t;

    boolean invis_pot=false;

    boolean poly_pot=false;

    private static Player player;

    private Player(Watch watch, Spell spell) {
        super();
        this.location = "Entrance";
        this.watch = watch;

        this.spell = spell;
        Cast_Stupefy sptupefy = new Cast_Stupefy(spell);
        Cast_Expecto_Patronum expecto_patronum = new Cast_Expecto_Patronum(spell);
        Cast_Expelliarmus expelliarmus = new Cast_Expelliarmus(spell);
        Cast_Protego protego = new Cast_Protego(spell);
        Command [] s =  {sptupefy,  expecto_patronum,expelliarmus,protego };
        spells = s;

        p = new ControlPanel(spells);

        System.out.println("Welcome to the Entrance of the school of wizards Hogwarts! ." +
                "\n\nYou are now at the doors of Hogwarts. The door on the north leads to \n" +
                "the dining hall, the door to the east leads to the Potions classroom, and\n" +
                "the door to the west leads to the Library.\n");

        boolean validchoice = false; // a flag or boolean to check the validity of the options

        String exit = "mischief managed"; // Exit phrase

        System.out.println("So were you want to go: ");

        Scanner obj = new Scanner(System.in);

        String c = obj.nextLine();

        while (!validchoice) {
            if (c.contains("Dining") || c.contains("dining") || c.contains("north") || c.contains("North")) {
                setLocation("Dining");
                new DiningHall(this);
                validchoice = true;
            } else if (c.contains("Library") || c.contains("library") || c.contains("west") || c.contains("West")) {
                setLocation("Library");
                new Library(this);
                validchoice = true;
            } else if (c.contains("Potions") || c.contains("potions") || c.contains("east") || c.contains("East")) {
                setLocation("Potions");
                new PotionsClassroom(this);
                validchoice = true;
            } else if (c.equals(exit)) {
                validchoice = true;
            } else {
                System.out.println("Invalid option please try again:");
                System.out.println();
                System.out.println("So were you want to go: ");
                c = obj.nextLine();
            }
            t = new Thread(this);
            t.start();
        }
    }

    public static synchronized Player getInstance(Watch watch, Spell spell)
    {
        if(player == null)
        {
            player = new Player(watch, spell);
        }
        return player;
    }

    public synchronized void setLocation(String location) {
        this.location = location;
    }

    public synchronized String getLocation() {
        return location;
    }

    @Override
    public void run() {
        Scanner obj = new Scanner(System.in);
        while (true) {
            if (watch.x) {
                String chief = obj.nextLine();
                if (chief.equals("mischief managed")) {
                    System.out.println("You close the map and you are lost because you failed to find hermione");
                    System.exit(1);
                }
                NotifyObserver();
            }



        }
    }
}
