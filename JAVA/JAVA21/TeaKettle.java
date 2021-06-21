public class TeaKettle
{
    public TeaKettle()
    {

    }
    public synchronized void tryPour(String n) //internal because monitorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr
    {
        System.out.println(n+" is pouring tea...");
    }
}