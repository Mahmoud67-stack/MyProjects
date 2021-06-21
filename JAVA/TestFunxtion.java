import java.awt.Font;

public class TestFunxtion {
    public static void plot(Function f, double a, double b, int n) {
        double[] y = new double[n + 1];
        double delta = (b - a) / n;
        for (int i = 0; i <= n; i++) {
            y[i] = f.evaluate(a + delta * i);
        }
        StdStats.plotPoints(y);
        StdStats.plotLines(y);
    }

    public static void main(String[] args) {
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        Function f1 = new Square();
        Function f2 = new GaussianPDF();
        Font font = new Font("Time New Roman", Font.BOLD, 25);
        StdDraw.setFont(font);
        while (true) {
            plot(f1, a, b, 50);
            StdDraw.text(20, 0.6, "Y = x^2");
            StdDraw.pause(1000);
            StdDraw.clear();
            plot(f2, a, b, 50);
            StdDraw.text(20, 0.6, "Y = (e^-x^2) /√2π");
            StdDraw.pause(1000);
            StdDraw.clear();
        }
    }
}
