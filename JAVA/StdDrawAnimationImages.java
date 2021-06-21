import java.awt.Color;

public class StdDrawAnimationImages {
    public static void main(String[] args) {
        /*
        StdDraw.clear();
        StdDraw.picture(0.5, 0.5, "238984.jpg", 0.5, 0.5, 80);
        try {
            Thread.sleep(3000);
        }
        catch (InterruptedException e) {
            StdOut.println(e);
        }
        StdDraw.clear();
                for (double i = 0; i <= 100; i += 0.01) {
            double x = (R + r) * Math.cos(i) - (r + a) * Math.cos(((R + r) / r) * i);
            double y = (R + r) * Math.sin(i) - (r + a) * Math.sin(((R + r) / r) * i);
            double degrees = -Math.toDegrees((R + r) / r) * i;
            StdDraw.picture(x, y, "earth.gif", degrees);
            StdDraw.show();
        }
        */

        StdDraw.setScale(-8, 8);
        StdDraw.enableDoubleBuffering();
        for (double t = 0.0; ; t += 0.02) {
            StdDraw.clear();
            StdDraw.setPenColor(Color.black);
            double x = Math.sin(t);
            double y = Math.cos(t);
            for (double i = -15.5; i < 15.5; i += 0.08) {
                StdDraw.line(-15.4, i, 15.4, i);
                StdDraw.line(i, -15.4, i, 15.4);
            }
            StdDraw.setPenColor(Color.ORANGE);
            StdDraw.filledCircle(0, 0, 0.3);
            double degrees = -Math.toDegrees(t);
            StdDraw.picture(x * 4, y * 4, "earth.gif", 30 * degrees);
            // StdDraw.filledCircle(x * 4, y * 4, 0.1);
            StdDraw.setPenColor(Color.WHITE);
            StdDraw.filledCircle(4 * x + Math.sin(t * 5), 4 * y + Math.cos(t * 5), 0.05);
            StdDraw.show();
            StdDraw.pause(20);
        }

    }
}
