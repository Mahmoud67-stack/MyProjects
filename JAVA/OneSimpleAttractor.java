import java.awt.Color;

public class OneSimpleAttractor {
    public static void main(String[] args) {
/*        StdDraw.enableDoubleBuffering();
        double rx = 0.0, ry = 0.0;
        StdDraw.setScale(-1, 1);
        while (true) {
            StdDraw.clear();
            StdDraw.setPenColor(Color.BLUE);
            StdDraw.filledCircle(rx, ry, 0.05);
            rx = StdDraw.mouseX();
            ry = StdDraw.mouseY();
            StdDraw.pause(100);
            StdDraw.show();
        }*/
        double rx = 0.0, ry = 0.0;   // position
        double vx = 0.0, vy = 0.0;   // velocity
        double mass = 1.0;           // mass
        double dt = 0.5;           // time quantum
        double drag = 0.1;           // mess around with this a bit
        double attractionStrength = 0.05;

        // do the animation
        StdDraw.enableDoubleBuffering();
        while (true) {

            // compute the attractive force to the mouse, accounting for drag
            // draw particle
            StdDraw.clear();
            StdDraw.setPenColor(Color.BLUE);

            double dx = StdDraw.mouseX() - rx;
            double dy = StdDraw.mouseY() - ry;
            double fx = (dx * attractionStrength) - (drag * vx);
            double fy = (dy * attractionStrength) - (drag * vy);

            // Euler step: update velocity, then position
            vx += fx * dt / mass;
            vy += fy * dt / mass;
            rx += vx * dt;
            ry += vy * dt;

            StdDraw.filledCircle(rx, ry, 0.02);
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}
