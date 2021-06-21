import java.awt.Color;

public class MouseFollower {
    public static void main(String[] args) {
        StdDraw.enableDoubleBuffering();
        while (true) {
            if (StdDraw.isMousePressed())
                StdDraw.setPenColor(Color.CYAN);
            else
                StdDraw.setPenColor(Color.BLUE);

            StdDraw.clear();
            StdDraw.filledCircle(StdDraw.mouseX(), StdDraw.mouseY(), 0.05);
            StdDraw.show();
        }
    }
}
