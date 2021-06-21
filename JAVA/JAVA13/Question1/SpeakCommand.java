package SoftwareDesign.LAB11.Question1;

public class SpeakCommand implements Command{

    R2D2 r2d2;
    SpeakCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    @Override
    public void execute() {
        r2d2.speak();
    }

    @Override
    public void undo() {
        System.out.println("R2D2 is silent now");
    }

}