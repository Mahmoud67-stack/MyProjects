import java.awt.Color;

public class Circles {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        float prob = Float.parseFloat(args[1]);
        double minraduis = Double.parseDouble(args[2]);
        double maxraduis = Double.parseDouble(args[3]);
        for (int i = 0; i < n; i++) {
            double raduis = (maxraduis * Math.random());
            if (raduis < minraduis) {
                raduis += minraduis;
            }
            double positionx = (1.0 * Math.random());
            double positiony = (1.0 * Math.random());
            if (prob * n < i)
                StdDraw.setPenColor(Color.white);
            else
                StdDraw.setPenColor(Color.black);
            StdDraw.filledCircle(positionx, positiony, raduis);
        }
    }
}
