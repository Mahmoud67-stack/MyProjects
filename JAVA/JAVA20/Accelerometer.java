import java.util.ArrayList;

public class Accelerometer implements Runnable, SubjectAccelerometer {
    private final ArrayList observersList;
    float[] values;
    Thread thr;

    Accelerometer() {
        values = new float[3];
        this.observersList = new ArrayList();
        thr = new Thread(this);
        thr.start();
    }

    public Thread getThread() {
        return thr;
    }

    public void register(final ObserverApplication o) {
        observersList.add(o);
    }

    public void remove(final ObserverApplication o) {
        final int x = observersList.indexOf(o);
        if (x > -1) {
            observersList.remove(x);
        } else {
            System.out.println("Observer doesnt exist....");
        }
    }

    public void notify(float[] values) 
    {
            for (int i = 0; i < observersList.size(); i++) 
            {
                final ObserverApplication dummy = (ObserverApplication) observersList.get(i);
                dummy.updateApp(this, this.values);
            }
    }

    public void run() {
        while (true)
        {
        for (int i = 0; i < values.length; i++)
            values[i] = (float) (Math.random() * 10);
        this.notify(this.values);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    } 
}