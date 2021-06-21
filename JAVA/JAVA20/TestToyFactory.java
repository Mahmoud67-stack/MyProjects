public class TestToyFactory 
{
    public static void main(String[] args)
    {
        ToyFactory tf;
        System.out.println("Making a car toy...");
        tf = new CarToy();
        tf.produceToy();

        System.out.println("\nMaking a truck toy...");
        tf = new TruckToy();
        tf.produceToy();
    }
}