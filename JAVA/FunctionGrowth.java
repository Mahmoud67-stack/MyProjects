public class FunctionGrowth {
    public static void main(String[] args) {
        System.out.println("           ln(n)\t\t\tn\t\t\tnln(n)\t\tn^2\t\tn^3\t\t2^n");
        for (int i = 16; i <= 2048; i *= 2) {
            System.out.println(
                    "for n=" + i + " " + Math.log(i) + "\t" + i + "\t" + (i * Math.log(i)) + "\t"
                            + Math.pow(i, 2.0) + "\t" + Math.pow(i, 3.0) + "\t" + Math.pow(2.0, i));
        }
    }
}
