public class Distance {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        double d = Math.sqrt((Math.pow((double) x, 2.0) + Math.pow((double) y, 2.0)));
        System.out.println("The distance between " + x + " and " + y + " is: " + d);
    }
}
