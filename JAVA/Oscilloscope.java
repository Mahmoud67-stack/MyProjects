public class Oscilloscope {
    public static void main(String[] args) {
        double A = Double.parseDouble(args[0]);
        double wx = Double.parseDouble(args[1]);
        double wy = Double.parseDouble(args[2]);
        double thetax = Double.parseDouble(args[3]);
        double thetay = Double.parseDouble(args[4]);

        StdDraw.setXscale(-Math.abs(A) - 1, Math.abs(A) + 1);
        StdDraw.setYscale(-Math.abs(A) - 1, Math.abs(A) + 1);
        double rad1 = Math.toRadians(thetax);
        double rad2 = Math.toRadians(thetay);
        double x = A * Math.sin(rad1);
        double y = A * Math.sin(rad2);
        for (double t = 0.1; t <= 100; t += 0.01) {
            double xi = A * Math.sin((wx * t) + rad1);
            double yi = A * Math.sin((wy * t) + rad2);
            StdDraw.line(x, y, xi, yi);
            x = xi;
            y = yi;
        }
    }
}
