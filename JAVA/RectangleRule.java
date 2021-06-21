public class RectangleRule {
    public static double integrate(Function f, double a, double b, int n) {
        double delta = (b - a) / n;
        double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += delta * f.evaluate(a + ((i + 0.50) * delta));
        }
        return sum;
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        StdOut.println(integrate(x -> Math.cos(x), a, b, 100000));
    }
}
