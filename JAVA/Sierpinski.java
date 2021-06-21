import java.awt.Color;

public class Sierpinski {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setYscale(-2, 2);
        StdDraw.setXscale(-2, 2);
        double[] x = { -0.5, 0, 0.5 };
        double[] y = { -0.5, (Math.sqrt(3) / 2) - 0.5, -0.5 };
        double X = 0, Y = 0;
        for (int i = 0; i < n; i++) {
            int rand = StdRandom.uniform(3);
            if (rand == 0)
                StdDraw.setPenColor(Color.RED);
            else if (rand == 1)
                StdDraw.setPenColor(Color.GREEN);
            else
                StdDraw.setPenColor(Color.BLUE);
            X = (X + x[rand]) / 2.0;
            Y = (Y + y[rand]) / 2.0;
            StdDraw.point(X, Y);
        }
    }
}
