public class Centroid {
    public static void main(String[] args) {
        StdOut.println(
                "Please enter the positions and masses of a sequence of objects (xi->y->mi): ");

        if (StdIn.isEmpty()) {
            StdOut.println("No value was entered");
            return;
        }
        float x = 0;
        float y = 0;
        float m = 0;

        while (!StdIn.isEmpty()) {
            float xi = StdIn.readFloat();
            float yi = StdIn.readFloat();
            float mi = StdIn.readFloat();
            x += (xi * mi);
            y += (yi * mi);
            m += mi;
        }

        y /= m;
        x /= m;

        StdOut.println(
                "The center of mass is located at (" + x + " , " + y + ") with mass of " + m);
    }
}
