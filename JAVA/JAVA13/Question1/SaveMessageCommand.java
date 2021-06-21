package SoftwareDesign.LAB11.Question1;

public class SaveMessageCommand implements Command{

    R2D2 r2d2;
    SaveMessageCommand(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }

    public void setMessage(String message) {
        r2d2.message = message;
    }

    @Override
    public void execute() {
        r2d2.save_message(r2d2.message);
    }

    @Override
    public void undo() {
        r2d2.save_message(r2d2.backup);
    }

}