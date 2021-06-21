public class Trigonometric {
    public static double sin(double x) {
        double term = 1;
        double sum = 0;
        for (int i = 1; sum != sum + term; i++) {
            term *= -(x / i);
            if (i % 2 != 0) {
                term = -term;
                sum += term;
            }
        }
        return sum;
    }

    public static double cos(double x) {
        double term = 1;
        double sum = 0;
        for (int i = 0; sum != sum + term; i++) {
            if (i == 0) {
                term = -1;
            }
            else
                term *= -(x / i);

            if (i % 2 == 0) {
                term = -term;
                sum += term;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        x = Math.toRadians(x);
        System.out.println("The sin of the angle is: " + sin(x));
        System.out.println("The cos of the angle is: " + cos(x));
    }
}
