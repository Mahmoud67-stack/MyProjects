public class DragonCurve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-100, 100);
        StdDraw.setYscale(-100, 100);
        Turtle turtle = new Turtle(0, 0, 0);
        turtle.goForward(0.5);
        for (int k = 1; k < (1 << n); k++) {
            if ((k & ((k ^ (k - 1)) + 1)) > 0) turtle.turnLeft(-90);
            else turtle.turnLeft(90);
            turtle.goForward(0.5);
        }
    }
}
