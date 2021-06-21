public class PowersOfTwo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("for " + n
                                   + " we have the following numbers less than or equal to it that are the power of 2: ");
        int power = 1;
        while (power <= n / 2) {
            power *= 2;
            System.out.println(power);
        }
    }
}

