public class Ball {
    private double rx;
    private double ry;
    private double vx;
    private double vy;
    private final double radius;

    public Ball() {
        rx = 0;
        ry = 0;
        vx = StdRandom.uniform(-0.015, 0.015);
        vy = StdRandom.uniform(-0.015, 0.015);
        radius = StdRandom.uniform(0.025, 0.075);
    }

    public void move() {
        if (Math.abs(rx + vx) + radius > 1.0) vx = -vx;
        if (Math.abs(ry + vy) + radius > 1.0) vy = -vy;
        rx += vx;
        ry += vy;
    }

    public void draw() {
        StdDraw.filledCircle(rx, ry, radius);
    }

    public static void main(String[] args) {
        StdDraw.setScale(-1, 1);
        StdDraw.setScale(-1, 1);
        Ball b1 = new Ball();
        Ball b2 = new Ball();


        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.setPenColor(StdDraw.BLACK);
        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);
            b1.move();
            b2.move();
            b1.draw();
            b2.draw();
            StdDraw.show();
            StdDraw.pause(20);
        }

    }

}
