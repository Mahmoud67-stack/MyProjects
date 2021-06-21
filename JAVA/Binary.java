public class Binary {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String x = "";
        while (n > 0) {
            x = n % 2 + x;
            n /= 2;
        }
        System.out.println("(" + x + ")2");
    }

}
