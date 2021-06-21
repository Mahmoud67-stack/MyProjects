package SoftwareDesign.LAB7.Question2;

public class Zombies extends Teams implements Runnable {
    Thread t;

    Zombies() {
        super();
        t = new Thread(this);
        t.start();
    }

    Zombies(Flag flag) {
        super("GREEN", 10, flag);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while (flag.color.equals("GREY")) {
            System.out.println("Zombies moved the flag");
            move(1);
            if (flag.location == 10) {
                flag.color = "GREEN";
            }
        }
    }
}
