/*
public class Exp {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        boolean negative = false;
        if (x < 0) {
            x = -x;
            negative = true;
        }
        double sum = 0;
        for (int i = 0; i < 100; i++) {
            double fact = 1;
            for (int j = i; j > 0; j--) {
                fact *= j;
            }
            sum += (Math.pow(x, i * 1.0) / fact);
        }
        if (negative) {
            sum = 1 / sum;
            System.out.println("The approximation for the sum is: " + sum);
        }
        else
            System.out.println("The approximation for the sum is: " + sum);
    }
}
*/
public class Exp {

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        System.out.println(Math.exp(x));

        // for negative argument, use identity e^-x =  1/e^x
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = -x;
        }

        // compute e^x assuming x >= 0
        double term = 1.0;
        double sum = 0.0;
        for (int n = 1; sum != sum + term; n++) {
            sum += term;
            term *= x / n;
        }

        // print results
        if (isNegative)
            sum = 1.0 / sum;
        System.out.println(sum);
    }
}
