public class NamelessApplication extends Applications
{
    NamelessApplication (SubjectAccelerometer s)
    {
        super("The application", s);
    }   
    public void updateApp(Accelerometer accel, float[] readings) 
    {
        app(readings);
    }
    public void filter()
    {
        System.out.println(this.name + " is applying high-pass filter.");
    }
    public void process()
    {
        System.out.println(this.name + " is doing its calculations");
    }
}