package SoftwareDesign.Project;

public class Scientists extends Enemy implements Runnable {
    Thread t;
    int z;
    boolean time_up = false;
    boolean running, alive;

    private static Scientists scientist;

    private Scientists(Subject Subject, int loc) {
        super(Subject);
        Killb=new nokill();
        Talkb=new dotalk();
        z = loc;
        running = true;
        alive = true;
        t = new Thread(this);
        t.start();
    }

    public synchronized void setAlive(boolean alive) {
        this.alive = alive;
    }

    public synchronized boolean isAlive() {
        return alive;
    }

    public static synchronized Scientists getInstance(Subject subject, int loc)
    {
        if( scientist == null)
        {
            scientist = new Scientists(subject, loc);
        }
        return scientist;
    }

    public synchronized void setTime_up(boolean time_up) {
        this.time_up = time_up;
    }

    public synchronized boolean isTime_up() {
        return time_up;
    }

    @Override
    public void run() {
        while (true)
        {
            if(!time_up) {
                try {
                    t.sleep(10000);
                }
                catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
                time_up = true;
        }
    }

    @Override
    public void update(int z) {
        while(running) {
            if (this.z == z) {
                    System.out.println("There is a scientist here");
                    running = false;
            }
        }
    }
}
