import java.awt.Color;

public class BouncingBall {
    public static void main(String[] args) {

        // set the scale of the coordinate system
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.enableDoubleBuffering();

        // initial values
        double rx = 0.480, ry = 0.860;     // position
        double vx = 0.015, vy = 0.023;     // velocity
        double radius = 0.05;              // radius

        // main animation loop
        while (true) {

            // bounce off wall according to law of elastic collision
            if (Math.abs(rx + vx) > 1.0 - radius) vx = -vx;
            if (Math.abs(ry + vy) > 1.0 - radius) vy = -vy;
            // clear the background
            StdDraw.clear(StdDraw.LIGHT_GRAY);

            StdDraw.setPenColor(Color.RED);
            // update position
            for (double k = 1.0; k >= 0.0; k -= 0.1) {
                StdDraw.filledCircle(rx + (vx * k), ry + (vy * k), radius);
            }
            rx = rx + vx;
            ry = ry + vy;
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledCircle(rx, ry, radius);

            // copy offscreen buffer to onscreen
            StdDraw.show();

            // pause for 20 ms
            StdDraw.pause(20);

        }
    }
}
