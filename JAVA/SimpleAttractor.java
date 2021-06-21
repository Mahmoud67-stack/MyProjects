import java.awt.Color;

public class SimpleAttractor {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double dt
                = 0.5; // constant time that represents thetime taken for a particle to reach the position after a vilocity is applied
        double attractionStrength = 0.05; // The Strength at which the mouse attracts the particles
        double drag
                = 0.05; // The drag that is caused by the mouse it causes a real world drag to the mouse
        double mass = 1.0; // the mass of the particles

        double[] rx = new double[n]; // an array that represents the x position of all n objects
        double[] ry = new double[n]; // an array that represents the y position of all n objects
        double[] vx = new double[n]; // an array that represents the vilocity of all n Objects
        double[] vy = new double[n]; // an array that represents the vilocity of all n objects

        while (true) { // here the animation starts
            StdDraw.clear(); // Clearing everything from previous drawing
            StdDraw.setPenColor(Color.BLUE); // Changing the color of the ball to blue
            if (StdDraw
                    .isMousePressed()) { // if the mouse is pressed we go here, where each particle is assigned to different velocity
                for (int i = 0; i < n; i++) {
                    vx[i] = 0.3 * Math
                            .random(); // The 0.3 coffectient represents the range at whcih the balls will be devided or randomly distributed among the  Canvas
                    vy[i] = 0.3 * Math.random();
                }
            }
            double[] fy
                    = new double[n]; // clearing the force values so we do not deal with infinite of negative infinity
            double[] fx = new double[n];

            for (int i = 0; i < n;
                 i++) { // Calculating the force on each particle depending its distance from the mouse and the attractionStrength, also we need to consider the drag force which is opposing the attraction strength
                double dx = StdDraw.mouseX() - rx[i];
                double dy = StdDraw.mouseY() - ry[i];
                fx[i] += attractionStrength * dx;
                fy[i] += attractionStrength * dy;
                fx[i] += -drag * vx[i];
                fy[i] += -drag * vy[i];
            }
            for (int i = 0; i < n;
                 i++) { // Using the euler step method to reduce the error of both the velocity and the location of the bal, then we calculate the vilocity for every ball using newton's second law
                vx[i] += dt * fx[i] / mass;
                vy[i] += dt * fy[i] / mass;
                rx[i] += vx[i] * dt; // The position is the vilocity multiply by the time
                ry[i] += vy[i] * dt; // The position is the vilocity multiply by the time
            }
            for (int i = 0; i < n; i++) {
                StdDraw.filledCircle(rx[i], ry[i], 0.02);
            }
            StdDraw.show();
            StdDraw.pause(20);
        }

    }
}
