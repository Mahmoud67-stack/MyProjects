package SoftwareDesign.HW3;

public class Watch extends ConcreteSubject implements Runnable {
    Thread t;
    boolean x;
    private static Watch instance;

    private Watch() {
        super();
        t = new Thread(this);
        t.start();
    }

    public static synchronized Watch getInstance()
    {
        if(instance == null)
        {
            instance = new Watch();
        }
        return instance;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 7; i++) {
                t.sleep(60000);
               System.out.println(i+"Weeks have passed, you have "+(5-i)+" Weeks left..");
            }
            System.out.println("You have 1 day to get out of the American Base");
            x = true;
            try {
                t.sleep(10000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            System.out.println("You stayed more than 1 week and 1 day, and russia got nuked and destroyed with everyone you care about");
            System.exit(1);
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}
