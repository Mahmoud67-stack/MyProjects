public class HiderB extends Hider 
{
    public HiderB(String n, SubjectSeeker s)
    {
        super(n,s);
    }
    public void hide()
    {
        System.out.println(name + " hid under a ramp");
    }
    public void updateHiders(Seeker s, int x)
    {
        System.out.println(name + " saw the seeker and runs");
      
        if (x == 1)
        {
            try 
            {
                Thread.sleep(5000);
            } 
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
            System.out.println(s.getName() + " catches " + name);
            System.out.println(name + " lost");
        }
    }


}