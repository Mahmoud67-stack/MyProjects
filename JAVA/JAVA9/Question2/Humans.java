package SoftwareDesign.LAB7.Question2;

public class Humans extends Teams implements Runnable {
    Thread t;

    Humans() {
        super();
        t = new Thread(this);
        t.start();

    }

    Humans(Flag flag) {
        super("RED", 0, flag);
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {

        while (flag.getColor().equals("GREY")) {
            System.out.println("Humans moved the flag");
            move(-1);
            if (flag.getLocation() == 0) {
                flag.setColor("RED");
            }
        }
        try {
            Thread.sleep(50);

        } catch (Exception e) {

            System.out.println(e);
        }
    }

}

