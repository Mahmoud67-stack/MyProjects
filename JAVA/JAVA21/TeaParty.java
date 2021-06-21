import java.util.Random;
public class TeaParty implements Runnable 
{
    String name;
    Thread thr;
    TeaKettle tea;
    public TeaParty(String n, TeaKettle t)
    {
        this.name = n;
        this.tea = t;
        this.thr = new Thread(this,this.name);
        this.thr.start();
    }
    public void run() 
    {
        
        while(true)
        {
            //synchronized(ball)
            {
                this.tea.tryPour(this.thr.getName());
                try
                {
                    Thread.sleep(new Random().nextInt(2500)+700);
                }
                catch(InterruptedException e) 
                {
                    e.printStackTrace();
                }
            }
        }
    }  

}