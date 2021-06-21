package SoftwareDesign.LAB11.Question1;

public class DeleteMessageCommand implements Command{
    R2D2 r2d2;
    DeleteMessageCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    @Override
    public void execute() {
        r2d2.delete_message();
    }

    @Override
    public void undo() {
        r2d2.save_message(r2d2.backup);
    }
}
