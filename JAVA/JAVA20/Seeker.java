import java.util.ArrayList;
import java.util.Random;
public class Seeker implements Runnable, SubjectSeeker 
{
    private final ArrayList observersList;
    Thread thr;
    String name;

    Seeker() {
        this.observersList = new ArrayList();
        name = "Seeker";
        thr = new Thread(this, name);
        thr.start();
    }
    public String getName()
    {
        return this.name;
    }
    final void play() {
        closeEyes();
        count();
        open();
    }

    public void closeEyes() {
        System.out.println(name + " closes their eyes");
    }

    public void count() 
    {
        System.out.println(name + " counts to 10..9..8..7..6..5..4..3..2..1");
        try {
            Thread.sleep(3 * 1000);
        } 
        catch (InterruptedException e) 
        {
            e.printStackTrace();
        }
    }
    public void open()
    {
        System.out.println(name + " opens their eyes");
    }
    public Thread getThread() {
        return thr;
    }

    public void registerHider(final ObserverHiders o) {
        observersList.add(o);
    }

    public void removeHider(final ObserverHiders o) {
        final int x = observersList.indexOf(o);
        if (x > -1) {
            observersList.remove(x);
        } else {
            System.out.println("Observer doesnt exist....");
        }
    }

    public void notifyHider(int x)
    {
            for (int i = 0; i < observersList.size(); i++) 
            {
                final ObserverHiders dummy = (ObserverHiders) observersList.get(i);
                dummy.updateHiders(this, x);
            }
    }

    public void run()
    {
        play();
        Random rnd = new Random();
        int x = rnd.nextInt(2);
        this.notifyHider(x);
    }
}