public class HyperBolic {
    public static double sinh(double x) {
        return (Math.exp(x) - Math.exp(-x)) / 2;
    }

    public static double cosh(double x) {
        return (Math.exp(x) + Math.exp(-x)) / 2;
    }

    public static double tanh(double x) {
        return (sinh(x) / cosh(x));
    }

    public static double sech(double x) {
        return (1 / cosh(x));
    }

    public static double csch(double x) {
        return (1 / sinh(x));
    }

    public static double coth(double x) {
        return (cosh(x) / sinh(x));
    }


    public static void main(String[] args) {
        StdOut.println("Please enter an angle in degrees: ");
        double x = 0;
        if (StdIn.isEmpty()) {
            StdOut.println("No value was entered");
        }
        else
            x = StdIn.readDouble();
        double y = Math.toRadians(x);
        StdOut.println("The value of sinh(" + x + ") is: " + sinh(y));
        StdOut.println("The value of cosh(" + x + ") is: " + cosh(y));
        StdOut.println("The value of tanh(" + x + ") is: " + tanh(y));
        StdOut.println("The value of sech(" + x + ") is: " + sech(y));
        StdOut.println("The value of coth(" + x + ") is: " + coth(y));
        StdOut.println("The value of csch(" + x + ") is: " + csch(y));
    }
}
