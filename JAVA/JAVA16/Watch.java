package SoftwareDesign.Project;

public class Watch  implements Runnable {
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
            for (int i = 1; i <= 5; i++) {
                t.sleep(60000);
               System.out.println(i+" hours have passed, you have "+(5-i)+" hours left for the nuclear bombs to be released..");
            }
            System.out.println("The nuclear bombs will be released in 1 hour, hurry!");

            try {
                t.sleep(60000);
            } catch (InterruptedException e) {
                e.getStackTrace();
            }
            System.out.println("You hear a big explosion, the nuclear bomb has been released.. Russia is eradicated");
            System.exit(1);
        }catch (Exception e) {
            e.getStackTrace();
        }
    }
}
