package SoftwareDesign.LAB7.Question2;

public class ZombiesB extends TeamsB implements Runnable {
    Thread t;

    ZombiesB() {
        super();
        t = new Thread(this);
        t.start();
    }

    ZombiesB(Flagb flag) {
        super("GREEN", 10, flag);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while (flag.color.equals("GREY")) {
            synchronized (flag) {
                System.out.println("Zombies moved the flag");
                move(1);
                if (flag.location == 10) {
                    flag.color = "GREEN";
                }
            }
            try {
                Thread.sleep(50);

            } catch (Exception e) {

                System.out.println(e);
            }
        }
    }
}
