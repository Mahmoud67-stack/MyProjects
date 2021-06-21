import java.util.Random;
public class Team implements Runnable 
{
    String team;
    int player;
    String playerID;
    Thread thr;
    Ball ball;
    public Team(String t, int p, Ball b)
    {
        this.ball = b;
        this.team = t;
        this.player = p;
        this.playerID = "Player "+player;
        this.thr = new Thread(this,playerID);
        this.thr.start();
    }
    public void run() 
    {
        
        while(true)
        {
            //synchronized(ball)
            {
                this.ball.tryGetBall(this.thr.getName(), this.team);
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