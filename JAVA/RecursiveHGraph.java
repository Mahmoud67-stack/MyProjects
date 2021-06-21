public class RecursiveHGraph {
    public static void DrawH(double X, double Y, double size) {
        double x1 = X + (size / 2);
        double x2 = X - (size / 2);
        StdDraw.line(x2, Y, x1, Y);
        StdDraw.line(x2, Y - (size / 2), x2, Y + (size / 2));
        StdDraw.line(x1, Y - (size / 2), x1, Y + (size / 2));
    }

    public static void drawHtree(int n, double X, double Y, double size) {
        if (n == 0) return;
        DrawH(X, Y, size);
        drawHtree(n - 1, X - (size / 2), Y + (size / 2), size / 2);
        drawHtree(n - 1, X + (size / 2), Y + (size / 2), size / 2);
        drawHtree(n - 1, X - (size / 2), Y - (size / 2), size / 2);
        drawHtree(n - 1, X + (size) / 2, Y - (size / 2), size / 2);

    }

    public static void main(String[] args) {
        StdDraw.setXscale(-20, 20);
        StdDraw.setYscale(-20, 20);
        drawHtree(7, 0.0, 0.0, 10);
    }
}
