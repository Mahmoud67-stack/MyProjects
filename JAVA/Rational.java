public class Rational {
    private final int numerator;
    private final int denominator;

    public Rational(int n, int d) {
        int r = gcd(n, d);
        numerator = n / r;
        denominator = d / r;
    }

    public Rational plus(Rational b) {
        int n = numerator;
        int d = denominator;
        if (d == b.denominator) {
            n += b.numerator;
            int r = gcd(n, d);
            n /= r;
            d /= r;
            Rational r1 = new Rational(n, d);
            return r1;
        }
        else {
            int n1 = b.numerator;
            int d1 = b.denominator;
            d *= d1;
            n *= d1;
            n1 *= denominator;
            d1 *= denominator;
            n += n1;
            int r = gcd(n, d1);
            n /= r;
            d1 /= r;
            Rational r1 = new Rational(n, d1);
            return r1;
        }
    }

    public Rational minus(Rational b) {
        int n = numerator;
        int d = denominator;
        if (d == b.denominator) {
            n -= b.numerator;
            int r = gcd(n, d);
            n /= r;
            d /= r;
            Rational r1 = new Rational(n, d);
            return r1;
        }
        else {
            int n1 = b.numerator;
            int d1 = b.denominator;
            d *= d1;
            n *= d1;
            n1 *= denominator;
            d1 *= denominator;
            n = n - n1;
            int r = gcd(n, d1);
            n /= r;
            d1 /= r;
            Rational r1 = new Rational(n, d1);
            return r1;
        }
    }

    public Rational times(Rational b) {
        int n = numerator;
        int d = denominator;
        n *= b.numerator;
        d *= b.denominator;
        int r = gcd(n, d);
        n /= r;
        d /= r;
        Rational r1 = new Rational(n, d);
        return r1;
    }

    public Rational divides(Rational b) {
        int n = b.numerator;
        int d = b.denominator;
        int temp = d;
        d = n;
        n = temp;
        Rational r1 = this.times(b);
        return r1;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }


    public static int gcd(int p, int q) {
        if (q == 0) return p;
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        Rational rational = new Rational(80, 34);
        Rational rational1 = new Rational(70, 89);
        Rational rational2 = new Rational(67, 54);
        Rational rational3 = new Rational(56, 37);
        Rational rational4 = new Rational(35, 98);
        StdOut.println(rational.toString() + " + " + rational1.toString() + " = " + rational
                .plus(rational1));
        StdOut.println(rational1.toString() + " * " + rational2.toString() + " = " + rational1
                .times(rational2));
        StdOut.println(rational2.toString() + " - " + rational3.toString() + " = " + rational2
                .minus(rational3));
        StdOut.println(rational3.toString() + " / " + rational4.toString() + " = " + rational3
                .divides(rational4));
    }
}
