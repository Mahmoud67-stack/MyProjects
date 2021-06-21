public class Koch {
    public static void koch(int n, int step, Turtle turtle) {
        if (n == 0) {
            turtle.goForward(step);
            return;
        }
        koch(n - 1, step, turtle);
        turtle.turnLeft(60.0);
        koch(n - 1, step, turtle);
        turtle.turnLeft(-120.0);
        koch(n - 1, step, turtle);
        turtle.turnLeft(60);
        koch(n - 1, step, turtle);
    }

    public static void main(String[] args) {
        StdDraw.setYscale(-2000, 2000);
        StdDraw.setXscale(-3000, 3000);
        int n = Integer.parseInt(args[0]);
        Turtle turtle = new Turtle(-2999, 0, 0);
        koch(n, 1, turtle);
    }
}
