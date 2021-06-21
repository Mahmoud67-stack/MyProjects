public class Lambda {
    public static double compute2(Function2 f, double x, double y) {
        return f.evaluate(x, y);
    }

    public static double compute(Function f, double x) {
        return f.evaluate(x);
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Function2 f = new Square2();
        Function f2 = new Square();
        StdOut.println(
                "Using the abstract method to evaluate " + x + "*" + y + " : " + compute2(f, x, y));
        StdOut.println(
                "Using the lambda expression to evaluate " + x + "*" + y + ":" + compute2(
                        (x1, y1) -> x1 * y1, x, y));
        StdOut.println(
                "Using the abstract method to evaluate the square of " + x + " : " + compute(f2,
                                                                                             x));
        StdOut.println(
                "Using the lambda expression to evaluate the square of " + x + " : " + compute(
                        x1 -> x1 * x1, x));

    }
}
