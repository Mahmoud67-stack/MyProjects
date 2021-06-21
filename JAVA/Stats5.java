public class Stats5 {
    public static void main(String[] args) {
        double x = Math.random();
        double y = Math.random();
        double z = Math.random();
        double max;
        double min;
        System.out.println("We have the three values: " + x + " " + y + " " + z);
        if (Math.max(x, y) == Math.max(z, y)) {
            System.out.println("The maximum value of all the three values is: " + y);
            System.out.println(("The minimum value of all the three values is: " + Math.min(z, y)));
        }

        else if (Math.max(x, z) == Math.max(y, z)) {
            System.out.println("The maximum value of all the three values is: " + z);
            System.out.println("The minimum value of all the three values is: " + Math.min(x, y));
        }
        else {
            System.out.println("The maximum value of all the three values is: " + x);
            System.out.println("The minimum value of all the three values is: " + Math.min(y, z));
        }
    }
}
