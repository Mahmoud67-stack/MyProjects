import java.awt.Color;
import java.awt.Font;

public class Banner {
    public static void main(String[] args) {
        String s = args[0];
        Font font = new Font("Times New Roman", Font.BOLD, 60);
        StdDraw.setFont(font);

        StdDraw.setPenColor(Color.WHITE);
        StdDraw.enableDoubleBuffering();

        for (double i = 0; ; i += 0.001) {
            StdDraw.clear(Color.BLACK);
            StdDraw.text((i % 1.0), 0.5, s);
            StdDraw.text((i % 1.0) - 1, 0.5, s);
            StdDraw.text((i % 1.0) + 1, 0.5, s);
            StdDraw.show();
        }
    }
}

