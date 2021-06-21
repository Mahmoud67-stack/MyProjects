public class Operationtime {
    public static void main(String[] args) {
        double x = System.currentTimeMillis();
        StdOut.println(x);
        for (int i = 0; i < 10000; i++) {
            int sum = 0;
            sum += i;
            for (int j = 0; j < 10000; j++) {
                sum += j;

                for (int k = 0; k < 10000; k++)
                    sum += k;
            }
            StdOut.println(sum);
        }
        x = System.currentTimeMillis();
        StdOut.println(x);
    }
}
