public class RGBtoYIQ {
    public static void main(String[] args) {
        double red = Integer.parseInt(args[0]);
        double green = Integer.parseInt(args[1]);
        double blue = Integer.parseInt(args[2]);
        System.out.println(
                "We have the values in RGB: (red=" + red + " ,green=" + green + " ,blue=" + blue
                        + ")");
        red = red / 255.0;
        blue /= 255.0;
        green /= 255.0;
        double y = (red * 0.299) + (green * 0.587) + (blue * 0.114);
        double i = (red * 0.5959) + (green * -0.2746) + (blue * -0.3213);
        double q = (red * 0.2115) + (green * -0.5227) + (blue * 0.3112);
        System.out.println(
                "Now We have the YIQ colors as follows: (Y=" + y + " ,I=" + i + " ,Q=" + q + ")");
    }
}
