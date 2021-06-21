public class YIQtoRGB {
    public static void main(String[] args) {
        double Y = Double.parseDouble(args[0]);
        double I = Double.parseDouble(args[1]);
        double Q = Double.parseDouble(args[2]);
        System.out.println("We have the YIQ vlaues as follows: (Y=" + Y + ", I=" + I +
                                   ", Q=" + Q + ")");

        long red = Math.round((Y + (0.956 * I) + (0.619 * Q)) * 255);
        long green = Math.round((Y + (-0.272 * I) + (-0.647 * Q)) * 255);
        long blue = Math.round((Y + (-1.106 * I) + (1.703 * Q)) * 255);

        System.out.println(
                "Now we have the RGB values as follows: (R=" + red + ", G=" + green + ", B=" + blue
                        + ")");
    }
}
