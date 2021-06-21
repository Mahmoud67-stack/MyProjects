public class HiderA extends Hider {
    public HiderA(String n, SubjectSeeker s) {
        super(n, s);
    }

    public void hide() {
        System.out.println(name + " hid behind a tree");
    }

    public void updateHiders(Seeker s, int x) {
        System.out.println(name + " saw the seeker and runs");
        if (x == 0)
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