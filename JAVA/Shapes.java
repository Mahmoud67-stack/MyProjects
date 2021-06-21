import java.awt.Font;

public class Shapes {
    public static void main(String[] args) {
        StdDraw.setCanvasSize(720, 720); //Setting the window size of the drawn file
        //StdDraw.setXscale(0, 10); Changing the X scale scale from the default 1 to 10
        //StdDraw.setYscale(0, 10);     Changing the Y axis scale from the default 1 to 10
        StdDraw.circle(0.1, 0.1, 0.05);
        StdDraw.ellipse(0.22, 0.1, 0.05, 0.08);
        StdDraw.square(0.33, 0.1, 0.05);
        StdDraw.rectangle(0.47, 0.15, 0.05, 0.08);
        StdDraw.filledCircle(0.1, 0.3, 0.05);
        StdDraw.filledEllipse(0.25, 0.3, 0.08, 0.05);
        StdDraw.filledSquare(0.39, 0.3, 0.05);
        StdDraw.filledRectangle(0.51, 0.4, 0.05, 0.08);
        StdDraw.arc(0.2, 0.5, 0.08, 90, 45);
        double[] x = { 0.7, 0.8, 0.9, 0.8 };
        double[] y = { 0.3, 0.4, 0.3, 0.2 };
        StdDraw.polygon(x, y);
        double[] x1 = { 0.7, 0.8, 0.9, 0.8 };
        double[] y1 = { 0.8, 0.9, 0.8, 0.7 };
        StdDraw.filledPolygon(x1, y1);
        StdDraw.text(0.6, 0.2, "اهلا انا محمود");
        StdDraw.text(0.7, 0.3, "Hello I am Mahmoud", 60);
        StdDraw.textLeft(0.1, 0.8, "Fuck this shit");
        StdDraw.textRight(0.1, 0.7, "Ok man");
        Font font = new Font("Times New Roman", Font.BOLD, 12);
        StdDraw.setFont(font);
        StdDraw.text(0.5, 0.5, "Hi You piece of shit");
        font = new Font("Arabic Typesetting", Font.BOLD, 20);
        StdDraw.setFont(font);
        StdDraw.text(0.7, 0.7, "حسنا ايها الفتى");
    }
}
