public class Closest {
    public static void main(String[] args) {
        float x = Float.parseFloat(args[0]);
        float y = Float.parseFloat(args[1]);
        float z = Float.parseFloat(args[2]);
        StdOut.println("Enter a sequence of coordinates (xi->yi->zi): ");
        if (StdIn.isEmpty()) {
            StdOut.println("No floating number was entered");
            return;
        }
        float closestx = x;
        float closesty = y;
        float closestz = z;
        double length;
        double prevlength = Math.abs(x) + Math.abs(y) + Math.abs(z);
        while (!StdIn.isEmpty()) {
            float xi = StdIn.readFloat();
            float yi = StdIn.readFloat();
            float zi = StdIn.readFloat();
            length = Math.abs(x - xi) + Math.abs(y - yi) + Math.abs(z - zi);
            if (length < prevlength) {
                prevlength = length;
                closestx = xi;
                closesty = yi;
                closestz = zi;
            }

        }
        StdOut.println(
                "The closest point to (" + x + " , " + y + " , " + z + ") is: (" + closestx + " , "
                        + closesty + " , " + closestz + ")");
    }
}
