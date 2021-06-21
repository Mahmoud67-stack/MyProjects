public abstract class Applications implements ObserverApplication
{
    String name;
    private SubjectAccelerometer subject;
    Applications(String n, SubjectAccelerometer s)
    {
        name = n;
        subject = s;
        subject.register(this);
    }
    final public void app(float[] readings)
    {
        read(readings);
        filter();
        process();
    }
    public void read(float[] readings)
    {
        System.out.print("Reading [");
        for(int i = 0; i < readings.length; i++)
        {
            System.out.print(readings[i]);
            if(i < (readings.length - 1))
                System.out.print(", ");
        }
        System.out.println("]");
    }
    abstract void filter();
    abstract void process();
}