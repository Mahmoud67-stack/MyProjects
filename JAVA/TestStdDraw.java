public class TestStdDraw {
    public static void main(String[] args) {
        StdDraw.setPenRadius(0.001);
        for (double i = 0; i < 0.7; i += 0.1) {
            StdDraw.line(0.15, 0.2 + i, 0.9, 0.2 + i);
            StdDraw.line(0.15 + i, 0.2, 0.15 + i, 0.9);
        }
        StdDraw.setPenRadius(0.01);
        StdDraw.setPenColor(StdDraw.MAGENTA);
        StdDraw.line(0.2, 0.9, 0.8, 0.2);
    }
}
