package SoftwareDesign.LAB12;

import java.util.Random;

public class Spook extends ConcreteSubject implements Runnable {
    Thread t;

    Spook()
    {

        t = new Thread(this);
        t.start();
    }

    @Override
    public String toString() {
        return "You're ";
    }

    @Override
    public void run() {
        Random r =  new Random();
        String spook_name = "spirit";
        while (true) {
            int some = r.nextInt() % 3;
            switch (some) {
                case 0:
                    spook_name = "slime shell";
                    break;
                case 1:
                    spook_name = "floating ghosts";
                    break;
                case 2:
                    spook_name = "spirit";
                    break;
            }
            Message m = new Message(this, "being attacked by a ", spook_name);
            try {
                t.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            publishMessage(m);
        }

    }
}
