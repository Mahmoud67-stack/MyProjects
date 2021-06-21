package SoftwareDesign.Project;

    public class Guard extends Enemy implements Runnable {
    Thread t;
    int z;
    boolean time_up = false;

    Guard(Subject Subject, int loc) {
        super(Subject);
        Killb=new dokill();
        Talkb=new notalk();
        t = new Thread(this);
        z = loc;
    }

    private State state = new UnawareGuard();

    public void previousState() {

    }

    public void nextState() {
        state.next(this);
    }

    public void printStatus() {
        state.printStatus();
    }

    public void setState(State state) {
        this.state = state;
    }

    public synchronized void setTime_up(boolean time_up) {
        this.time_up = time_up;
    }

    public synchronized boolean isTime_up() {
        return time_up;
    }

    @Override
    public void run() {
       /* Random r = new Random();

        while (true) {
            if (state.getClass().getSimpleName().equals("UnawareGuard")) {

                } catch (Exception e) {
                    System.out.println(e);
                }
            } else if (state.getClass().getSimpleName().equals("SuspiciousGuard")) {
                try {
                    t.sleep(2500);
                } catch (Exception e) {
                    System.out.println(e);
                }
            } else if (state.getClass().getSimpleName().equals("AlertedGuard")) {
                try {
                    t.sleep(1000);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }*/

        if(!isTime_up()) {
            try {
                t.sleep(10000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
        setTime_up(true);

    }

    @Override
    public void update(int z) {
        while(true) {
            if (this.z == z) {
                System.out.println("There is a guard here");
                subject.RemoveObserver(this);
                break;
            }
        }
    }
}

