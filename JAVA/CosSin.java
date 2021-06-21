public class CosSin {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        double cose = Math.cos(t);
        double sint = Math.sin(t);
        double tot = Math.pow(sint, 2.0) + Math.pow(cose, 2.0);
        System.out.println("cos2 (0) + sin2 (0) = " + tot);

        System.out.println((3 + 2) + "Bc");
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println(2 - Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE * 2);
        System.out.println(Integer.MAX_VALUE + Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE * 4);
        System.out.println(-3 - Integer.MAX_VALUE);

    }
}
