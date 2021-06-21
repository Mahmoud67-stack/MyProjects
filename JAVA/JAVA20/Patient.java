import java.util.ArrayList;
public class Patient implements Runnable, SubjectPatient 
{
    private final ArrayList observersList;
    Thread thr;
    int temp;

    public Patient() {
        this.observersList = new ArrayList();
        thr = new Thread(this, "Patient");
        thr.start();
    }

    public Thread getThread() 
    {
        return thr;
    }

    public void register(final ObserverDoctor o) {
        observersList.add(o);
    }

    public void remove(final ObserverDoctor o) {
        final int x = observersList.indexOf(o);
        if (x > -1) {
            observersList.remove(x);
        } else {
            System.out.println("Observer doesnt exist....");
        }
    }

    public void notify(final int temp) {
        for (int i = 0; i < observersList.size(); i++) {
            final ObserverDoctor dummy = (ObserverDoctor) observersList.get(i);
            dummy.updateDr(this, this.temp);
        }
    }

    public void run() {
        while (true) {
            this.temp = (int) (96 + Math.random() * 10);
            this.notify(this.temp);
            try {
                Thread.sleep(10 * 1000);
            } catch (final InterruptedException e) 
            {
                e.printStackTrace();
            }
        }
    }
    
}