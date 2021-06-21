public class WindChill {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);

        double w = 35.74 + (0.6215 * t) + ((0.475 * t - 35.75) * Math.pow(v, 0.16));
        System.out.println("With temprature " + t +
                                   " Fahrenhiet and wind speed " + v + " mph we wiil have: " + w
                                   + " Wind Chill");
    }
}
