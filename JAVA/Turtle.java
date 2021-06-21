public class Turtle {
    private double x;
    private double y;
    private double a;

    public Turtle(double x0, double y0, double a0) {
        x = x0;
        y = y0;
        a = a0;
    }

    public void turnLeft(double delta) {
        a += delta;
    }

    public void goForward(double step) {
        double ang = Math.toRadians(a);
        double stepx = x;
        double stepy = y;
        x += (step * Math.cos(ang));
        y += (step * Math.sin(ang));
        StdDraw.line(stepx, stepy, x, y);
    }

    public void setXscale(double min, double max) {
        StdDraw.setXscale(min, max);
    }

    public void setYscale(double min, double max) {
        StdDraw.setYscale(min, max);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Turtle turtle = new Turtle(0, 0, 90);
        turtle.setXscale(-20, 20);
        turtle.setYscale(-20, 20);
        for (int i = 0; i < n; i++) {
            int r = StdRandom.uniform(2);
            if (r == 0) {
                turtle.goForward(0.5);
            }
            else {
                turtle.turnLeft(60);
            }
        }

    }
}
