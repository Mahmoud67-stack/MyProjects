public class RunApp 
{
    public static void main(String[] args) 
    {
        Accelerometer acc = new Accelerometer();
        Game game = new Game(acc);
        NamelessApplication app = new NamelessApplication(acc);   
    }
}