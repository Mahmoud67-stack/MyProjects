package SoftwareDesign.LAB11.Question1;

public class ShowMapGalaxy implements Command{
    R2D2 r2d2;
    ShowMapGalaxy(R2D2 r2d2)
    {
        this.r2d2 = r2d2;
    }


    @Override
    public void execute() {
        r2d2.show_map();
    }

    @Override
    public void undo() {
        System.out.println("Hiding map");
    }
}
