package SoftwareDesign.LAB11.Question1;

public class MoveDownCommand implements Command{
    R2D2 r2d2;
    MoveDownCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    @Override
    public void execute() {
        r2d2.move_down();
    }

    @Override
    public void undo() {
        r2d2.move_up();
    }
}
