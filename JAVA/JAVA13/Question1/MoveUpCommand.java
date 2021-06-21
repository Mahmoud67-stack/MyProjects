package SoftwareDesign.LAB11.Question1;

public class MoveUpCommand implements Command{
    R2D2 r2d2;
    MoveUpCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    @Override
    public void execute() {
        r2d2.move_up();
    }

    @Override
    public void undo() {
        r2d2.move_down();
    }
}
