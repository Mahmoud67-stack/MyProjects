package SoftwareDesign.HW2;

public class Hermione extends Character {
    Harry harry;

    Hermione(Harry harry, UserInterface UI) {
        super("Hermione", 18, "Library", UI);
        this.harry = harry;
        t = new Thread(this);
        t.start();
    }

    void monitor() {
        while (true) {
            if (harry.getLocation().equals(this.location)) {
                UI.write("Harry I am here!");
                break;
            }
        }
    }

    @Override
    public void run() {
        monitor();
    }
}
