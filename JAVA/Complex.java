public class Complex {
    private double real;
    private double imag;

    public Complex(double real0, double imag0) {
        real = real0;
        imag = imag0;
    }

    public Complex plus(Complex b) {
        real += b.real;
        imag += b.imag;
        return this;
    }

    public Complex times(Complex b) {
        real = (real * b.real) - (imag * b.imag);
        imag = (imag * b.real) + (real * b.imag);
        return this;
    }

    public double abs() {
        return Math.sqrt(real * real + imag * imag);
    }

    public double re() {
        return real;
    }

    public double im() {
        return imag;
    }

    public String toString() {
        if (imag > 0)
            return real + " + " + imag + "i";
        if (imag < 0)
            return real + " - " + (-1.0 * imag) + "i";
        else
            return real + "";
    }

    public static void main(String[] args) {
        Complex comp = new Complex(-1, 2);
        Complex comp1 = new Complex(-3.9, 7.2);
        Complex comp2 = new Complex(-6.2, 0.8);
        StdOut.print("(" + comp.toString() + ")" + " + " + "(" + comp1.toString() + ")");
        StdOut.println(" = " + comp.plus(comp1));
        StdOut.print("(" + comp1.toString() + ")" + " * " + "(" + comp2.toString() + ")");
        StdOut.println(" = " + comp1.times(comp2).toString());
    }
}
