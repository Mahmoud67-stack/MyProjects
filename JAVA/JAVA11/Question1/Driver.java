package SoftwareDesign.LAB9.Question1;

public class Driver {

    public static void main(String[] args)
    {
        Watch watch = new Watch();

        Player.getInstance(watch);
    }
}
