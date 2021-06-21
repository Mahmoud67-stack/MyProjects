package SoftwareDesign.LAB11.Question1;

public class MoveRightCommand implements Command {
    R2D2 r2d2;
    MoveRightCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    @Override
    public void execute() {
        r2d2.move_right();
    }

    @Override
    public void undo() {
        r2d2.move_left();
    }
}
