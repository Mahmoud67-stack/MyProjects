public class Barycenter {
    public static void main(String[] args) {
        double m1 = Double.parseDouble(args[0]);
        double m2 = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);
        double R1 = Double.parseDouble(args[3]);
        double r1 = (a * m2) / (m1 + m2);
        System.out.println("The distance r1 is: " + r1);
        if (r1 <= R1) {
            System.out.println("r1<=R1, Therefore the barycenter lies inside the first body");
        }

    }
}
