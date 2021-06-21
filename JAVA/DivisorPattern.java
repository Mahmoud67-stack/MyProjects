public class DivisorPattern {
    public static void main(String[] args) {
        int c = Integer.parseInt(args[0]);
        int r = Integer.parseInt(args[1]);
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i % j == 0)
                    System.out.print("* ");
                else if (j % i == 0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println(i);
        }

    }
}
