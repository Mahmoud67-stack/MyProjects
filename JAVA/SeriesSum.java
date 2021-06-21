public class SeriesSum {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum = sum + 1 / (1.0 * i * i); // Good   - multiply by 1.0 to cast to double
            // sum+=1.0/(i*i); //Bad    - Oveflow if n>65,535
            // sum+=1/(i*i);   //Bad    - integer division
            // sum+=1.0/i*i;   //Bad    - computes (1.0/i)*i
        }
        System.out.println("The sum is: " + sum);
        System.out.println("And the approximate value for PI is: " + Math.sqrt(6.0 * (sum)));
    }
}
