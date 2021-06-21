public class Bow {
    public static void main(String[] args) {
        double drag = 0.09;
        double springStrength = 0.1;
        double timestep = 0.5;
        double springLength = 1;
        double initx1 = 0;
        double inity1 = -0.5;
        double initx2 = 0;
        double inity2 = 0.5;

        StdDraw.setXscale(-1, 1);
        StdDraw.setYscale(-1, 1);
        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.setPenRadius(0.0025);
        StdDraw.enableDoubleBuffering();
        while (true) {
            StdDraw.clear();
            StdDraw.line(0.0, -0.5, 0.0, 0.5);
            StdDraw.arc(0, 0, 0.5, 90, 270);
            while (StdDraw.isMousePressed() && StdDraw.mouseY() <= 0.75 && StdDraw.mouseY() >= -0.75
                    && StdDraw.mouseX() <= 0.75 && StdDraw.mouseX() >= 0) {
                StdDraw.clear();
                StdDraw.line(0.0, -0.5, StdDraw.mouseX(), StdDraw.mouseY());
                StdDraw.line(StdDraw.mouseX(), StdDraw.mouseY(), 0.0, 0.5);
                StdDraw.arc(0, 0, 0.5, 90 + StdDraw.mouseY(), 270 + StdDraw.mouseY());
                StdDraw.show();
                StdDraw.pause(20);
            }
            StdDraw.show();
            StdDraw.pause(20);
        }

    }
}
