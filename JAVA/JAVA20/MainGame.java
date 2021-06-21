public class MainGame {
    public static void main(String[] args) throws InterruptedException 
    {
        Seeker s = new Seeker();
        Hider p1 = new HiderA("Maya", s);
        Hider p2 = new HiderB("Kharoof", s);
        System.out.println("Game started");
        p1.hide();
        p2.hide();    
        
    }
}