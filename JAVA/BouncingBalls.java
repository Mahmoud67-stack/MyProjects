public class BouncingBalls {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Ball[] balls = new Ball[n];
        for (int i = 0; i < n; i++) {
            balls[i] = new Ball();
        }
        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.enableDoubleBuffering();
        StdDraw.clear(StdDraw.GRAY);
        StdDraw.setPenColor(StdDraw.BLACK);
        while (true) {
            StdDraw.clear(StdDraw.GRAY);
            StdDraw.setPenColor(StdDraw.BLACK);
            for (int i = 0; i < n; i++) {
                balls[i].move();
                balls[i].draw();
            }
            StdDraw.show();
            StdDraw.pause(20);
        }
    }
}
