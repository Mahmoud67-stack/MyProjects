package SoftwareDesign.HW2;

public class Watch extends Tool implements Runnable {
    Thread t;
    boolean x;
    UserInterface UI;

    Watch(UserInterface UI) {
        super("Watch", "Time");
        this.UI = UI;
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                t.sleep(60000);
                UI.write(i + " Minutes have passed");
            }
            UI.write("Hurry up Harry you have 10 seconds to close the map!");
            x = true;
            try {
                t.sleep(10000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            UI.write("you have been caught using the map and the map has been confiscated and you lost");
            System.exit(1);
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}
