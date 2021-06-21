public class Brownian {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double step = Double.parseDouble(args[1]);
        StdDraw.setXscale(-10, 10);
        StdDraw.setYscale(-10, 10);
        Turtle turtle = new Turtle(0.5, 0.5, 0);
        for (int i = 0; i < n; i++) {
            double rand = StdRandom.uniform(0.0, 360);
            turtle.turnLeft(rand);
            turtle.goForward(step);
        }
    }
}
