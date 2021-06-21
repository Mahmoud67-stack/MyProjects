public class Universe {
    private final int n;             // number of bodies
    private final Body[] bodies;     // array of n bodies

    // read universe from standard input
    public Universe() {
        In infile = new In("infile.txt");
        // number of bodies
        n = infile.readInt();

        // the set scale for drawing on screen
        double radius = infile.readDouble();
        StdDraw.setXscale(-radius, +radius);
        StdDraw.setYscale(-radius, +radius);

        // read in the n bodies
        bodies = new Body[n];
        for (int i = 0; i < n; i++) {
            double rx = infile.readDouble();
            double ry = infile.readDouble();
            double vx = infile.readDouble();
            double vy = infile.readDouble();
            double mass = infile.readDouble();
            double[] position = { rx, ry };
            double[] velocity = { vx, vy };
            Vector r = new Vector(position);
            Vector v = new Vector(velocity);
            bodies[i] = new Body(r, v, mass);
        }
    }

    // increment time by dt units, assume forces are constant in given interval
    public void increaseTime(double dt) {

        // initialize the forces to zero
        Vector[] f = new Vector[n];
        for (int i = 0; i < n; i++) {
            f[i] = new Vector(new double[2]);
        }

        // compute the forces
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    f[i] = f[i].plus(bodies[i].forceFrom(bodies[j]));
                }
            }
        }

        // move the bodies
        for (int i = 0; i < n; i++) {
            bodies[i].move(f[i], dt);
        }
    }

    // draw the n bodies
    public void draw() {
        for (int i = 0; i < n; i++) {
            bodies[i].draw();
        }
    }


    // client to simulate a universe
    public static void main(String[] args) {
        Universe newton = new Universe();
        double dt = Double.parseDouble(args[0]);
        StdDraw.enableDoubleBuffering();
        while (true) {
            StdDraw.clear();
            newton.increaseTime(dt);
            newton.draw();
            StdDraw.show();
            StdDraw.pause(10);
        }
    }
}

