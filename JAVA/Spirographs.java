import java.awt.Color;

public class Spirographs {
    public static void main(String[] args) {
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        StdDraw.setXscale(-300, 300);
        StdDraw.setYscale(-300, 300);
        StdDraw.clear(Color.BLACK);
        StdDraw.enableDoubleBuffering();

        for (double i = 0; i <= 100; i += 0.01) {
            double x = (R + r) * Math.cos(i) - (r + a) * Math.cos(((R + r) / r) * i);
            double y = (R + r) * Math.sin(i) - (r + a) * Math.sin(((R + r) / r) * i);
            double degrees = -Math.toDegrees((R + r) / r) * i;
            StdDraw.picture(x, y, "earth.gif", degrees);
            StdDraw.show();
        }
    }
}
