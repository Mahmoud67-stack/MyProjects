public class CartesianToPolar {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double r = Math.sqrt(Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0));
        double theta = Math.toDegrees(Math.atan(y / x));

        System.out.println(
                "From the Cartesien (" + x + "," + y + ") To Polar (" + r + "," + theta + ")");

    }
}
