public class max3fun {
    public static int max3(int n1, int n2, int n3) {
        if (Math.max(n1, n2) == n2) {
            if (Math.max(n2, n3) == n2)
                return n2;
            else
                return n3;

        }
        else {
            if (Math.max(n1, n3) == n1)
                return n1;
            else
                return n3;
        }
    }

    public static double max3(double n1, double n2, double n3) {
        if (Math.max(n1, n2) == n2) {
            if (Math.max(n2, n3) == n2)
                return n2;
            else
                return n3;
        }
        else {
            if (Math.max(n1, n3) == n1)
                return n1;
            else
                return n3;
        }
    }

    public static void main(String[] args) {
        int n1 = Integer.parseInt(args[0]);
        int n2 = Integer.parseInt(args[1]);
        int n3 = Integer.parseInt(args[2]);

        double n4 = Double.parseDouble(args[3]);
        double n5 = Double.parseDouble(args[4]);
        double n6 = Double.parseDouble(args[5]);
        StdOut.println(
                "The maximum value of the first three integer values is: " + max3(n1, n2, n3));
        StdOut.println("The maximum of the last three double values is: " + max3(n4, n5, n6));
    }
}
