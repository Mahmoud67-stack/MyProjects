package SoftwareDesign.LAB10.Question1;

public class Driver {
    public static void main(String [] args)
    {
        Structure structure = new Ramp();
        structure.Build();

        System.out.println();

        structure = new Box();
        structure.Build();

        System.out.println();

        structure = new Fort();
        structure.Build();

        System.out.println();

    }
}
