import java.awt.Color;

public class Mandelbrot {
    public static int mand(Complex z0, int max) {
        Complex z = z0;
        for (int t = 0; t < max; t++) {
            if (z.abs() > 2.0) return t;
            z.times(z).plus(z0);
        }
        return max;
    }

    public static void main(String[] args) {
        double xc = Double.parseDouble(args[0]);
        double yc = Double.parseDouble(args[1]);
        double size = Double.parseDouble(args[2]);

        Picture picture = new Picture(512, 512);
        for (int i = 0; i < 512; i++) {
            for (int j = 0; j < 512; j++) {
                double x0 = xc - size / 2 + size * j / 512;
                double y0 = yc - size / 2 + size * j / 512;
                Complex z0 = new Complex(x0, y0);
                int gray = 255 - mand(z0, 255);
                Color color = new Color(gray, gray, gray);
                picture.set(i, 512 - 1 - j, color);
            }
        }
        picture.show();
    }
}
