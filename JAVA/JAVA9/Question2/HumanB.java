package SoftwareDesign.LAB7.Question2;

public class HumanB extends TeamsB implements Runnable {
    Thread t;

    HumanB() {
        super();
        t = new Thread(this);
        t.start();

    }

    HumanB(Flagb flag) {
        super("RED", 0, flag);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while (flag.color.equals("GREY")) {
            synchronized (flag) {
                System.out.println("Humans moved the flag");
                move(-1);
                if (flag.location == 0) {
                    flag.color = "RED";
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
