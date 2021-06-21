public class SqrtTest {
    public static double sqrt(double arg) {
        double t = arg;
        double epsilon = 1.0e-15;
        while (Math.abs(t - arg / t) > epsilon * t) {
            t = (arg / t + t) / 2.0;
        }
        return t;
    }

    public static void main(String[] args) {
        StdOut.println("Enter a number to find its square root: ");
        double sqr = 0;
        if (!StdIn.isEmpty())
            sqr = StdIn.readDouble();
        StdOut.println("The square root is: " + sqrt(sqr));
    }
}
