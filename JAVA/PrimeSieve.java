public class PrimeSieve {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("The numbers that are primes and less than " + n + " are: ");
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0)
                    isPrime = false;
            }
            if (isPrime)
                System.out.print(i + " ");
            else
                isPrime = true;
        }
    }
}
