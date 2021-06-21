public class Discriminantofcubicpolynomial {
    public static void main(String[] args) {
        int b = Integer.parseInt(args[0]);
        int c = Integer.parseInt(args[1]);
        int d = Integer.parseInt(args[2]);
        double discriminant =
                (b * b) * (2 * c * c) - (4 * Math.pow(c, 4.0)) - 4 * (Math.pow(b, 3.0) * d) - 27 * (
                        d * d) + 18 * b * c * d;

        System.out.println("The discriminant is: " + discriminant);

    }
}
