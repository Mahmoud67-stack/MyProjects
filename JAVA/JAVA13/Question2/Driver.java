package SoftwareDesign.LAB11.Question2;

public class Driver {
    public static void main(String[] args)

    {
        Context context= new Context();

        context.printStatus();
        context.shell=true;
        context.nextState();
        context.printStatus();
        context.mushroom=true;
        context.nextState();
        context.printStatus();
        context.flower=true;
        context.nextState();
        context.printStatus();
    }
}
