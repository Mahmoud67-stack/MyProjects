
public class MainofEx3 {
    public static void main(String args[]) throws InterruptedException
    {
        Ball ball = new Ball();
        Team[] player = new Team[22];
        for(int i = 1; i < 23; i++)
        {
            if (i%2==0)
            {
                player[i] = new Team("Real Madrid",i, ball);
            }
            else
            {
                player[i] = new Team("Manchester United",i, ball);
            }
        }
    }
}