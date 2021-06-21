public class Factors {
    public static boolean isPrime(int n) {
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        long n = Long.parseLong(args[0]);
        int x = 2;
        System.out.println("The prime factors of " + n + " are: ");
        if (n <= 2) System.out.print(n);
        while (x < n) {
            if (n % x == 0 && isPrime(x)) {
                System.out.print(x + ", ");
            }
            else if (n % x == 0 && !isPrime(x)) {
                for (int i = 2; i * i < x; i++) {
                    if (x % i == 0 && isPrime(i))
                        System.out.print(i + ", ");
                }
            }
            x++;
        }
        System.out.println();
    }
}
