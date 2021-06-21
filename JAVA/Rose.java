public class Rose {

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(-1, +1);
        StdDraw.setYscale(-1, +1);
        StdDraw.setPenColor(StdDraw.PINK);
        while (true) {
            double x0 = 0, y0 = 0;
            for (double t = 0.0; t <= 2 * Math.PI; t += 0.01) {
                double r = Math.sin(n * t);
                double x1 = r * Math.cos(t);
                double y1 = r * Math.sin(t);
                StdDraw.line(x0, y0, x1, y1);
                x0 = x1;
                y0 = y1;
            }
            StdDraw.clear();
        }

    }
}
