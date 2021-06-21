import java.awt.Color;

public class Clock {
    public static void main(String[] args) {
        StdDraw.setXscale(-1.0, 1.0);
        StdDraw.setYscale(-1.0, 1.0);
        StdDraw.setPenColor(Color.WHITE);
        StdDraw.enableDoubleBuffering();
        double sangle = 90;
        double mangle = 90;
        double hangle = 90;
        int seccount = 0;
        int minutescount = 0;
        int hourscount = 0;
        while (true) {
            StdDraw.clear(Color.BLACK);
            StdDraw.setPenRadius(0.003);
            StdDraw.circle(0.0, 0.0, 0.5);
            for (int i = 0; i < 360; i += 6) {
                double fact;
                if (i % 90 == 0)
                    fact = 0.4;
                else if (i % 30 == 0)
                    fact = 0.45;
                else
                    fact = 0.48;
                double radian = Math.toRadians(i);
                StdDraw.line(0.5 * Math.cos(radian), 0.5 * Math.sin(radian),
                             fact * Math.cos(radian),
                             fact * Math.sin(radian));
            }
            double radian1 = Math.toRadians(sangle);
            double radian2 = Math.toRadians(mangle);
            double radian3 = Math.toRadians(hangle);
            double x = 0.5 * Math.cos(radian1);
            double y = 0.5 * Math.sin(radian1);
            StdDraw.line(x, y, 0.0, 0.0);
            StdDraw.setPenRadius(0.005);
            StdDraw.line(0, 0, 0.5 * Math.cos(radian2), 0.5 * Math.sin(radian2));
            StdDraw.line(0.0, 0.0, 0.3 * Math.cos(radian3), 0.3 * Math.sin(radian3));
            sangle -= 6;
            StdDraw.text(0.0, -0.6, hourscount + " : " + minutescount + " : " + seccount);
            seccount++;
            if (seccount == 60) {
                seccount = 0;
                minutescount++;
                mangle -= 6;
            }
            if (minutescount == 60) {
                minutescount = 0;
                hourscount++;
                hangle -= 30;
            }
            StdDraw.show();
            StdDraw.pause(1000);
        }
    }
}
