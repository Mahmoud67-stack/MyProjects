public class HarmonicNumber {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int c = n;
        double sum = 0;
        while (n != 0) {
            sum += (1.0 / n);
            if (c == n)
                System.out.print("1/" + n);
            else
                System.out.print(" + 1/" + n);
            n--;

        }
        System.out.print(" = " + sum + "\n");
    }
}
