
public class Ball {
    public Ball(){}
    public synchronized void tryGetBall(String name, String tm)
    {
        System.out.println(name + " from team " + tm + " has the ball");
       
    }
}