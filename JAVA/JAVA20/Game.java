public class Game extends Applications 
{
    Game(SubjectAccelerometer s)
    {
        super("Game", s);
    }   
    public void updateApp(Accelerometer accel, float[] readings) 
    {
        app(readings);
    }
    public void filter()
    {
        System.out.println(this.name + " is applying low-pass filter.");
    }
    public void process()
    {
        System.out.println(this.name + " is showing graphics.");
    }
}