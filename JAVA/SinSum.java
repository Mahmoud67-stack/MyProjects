public class SinSum {
    public static void main(String[] args) {
        double an = Double.parseDouble(args[0]);
        double tot = Math.sin(3 * Math.toRadians(an)) + Math.sin(2 * Math.toRadians(an));
        System.out.println("The summation sin3*" + an + " + sin2*" + an + " = " + tot);
    }
}
