import java.awt.Color;

public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdDraw.setXscale(0, n);
        StdDraw.setYscale(0, n);
        Color color = Color.RED;
        for (double i = 0.5; i < n; i++) {
            for (double j = 0.5; j < n; j++) {
                StdDraw.setPenColor(color);
                StdDraw.filledSquare(i, j, 0.5);
                if (color.equals(Color.RED)) {
                    color = Color.BLACK;
                }
                else
                    color = Color.RED;
            }
            if (color.equals(Color.RED)) {
                color = Color.BLACK;
            }
            else
                color = Color.RED;
        }
    }
}
