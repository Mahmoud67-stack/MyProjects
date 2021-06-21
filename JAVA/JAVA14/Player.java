package SoftwareDesign.LAB12;


public class Player extends ConcreteSubject implements Observer, Runnable{
    Thread t;

    TCP_Client tcp;
    Player(TCP_Client tcp)
    {
        this.tcp = tcp;

        tcp.RegisterObserver(this);

        t = new Thread(this);
        t.start();
    }

    @Override
    public void update(Message msg) {
        if(msg.payload.equals("ghost traps"))
        {
            GhostTraps gt =  new GhostTraps();

            Message m = new Message(this, "changed weapon to ", gt.wb.attack());

            try {
                t.sleep(5000);
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
            publishMessage(m);
        }

        else if(msg.payload.equals("proton packs"))
        {
            ProtonPacks pk =  new ProtonPacks();

            Message m = new Message(this, "changed weapon to ", pk.wb.attack());
            try {
            t.sleep(5000);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
            publishMessage(m);
        }

        else if(msg.payload.equals("slime blowers"))
        {
            SlimeBlowers sb =  new SlimeBlowers();

            Message m = new Message(this, "changed weapon to ", sb.wb.attack());

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

    @Override
    public String toString() {
        return "The Ghostbuster ";
    }

    @Override
    public void run() {
    }
}
