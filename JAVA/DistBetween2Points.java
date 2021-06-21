public class DistBetween2Points {
    public static void main(String[] args) {
        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);
        System.out.println(
                "The distance between point (" + x1 + ", " + y1 + ") and point (" + x2 + ", " + y2
                        + ") is: ");
        System.out.println("=> " + Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
