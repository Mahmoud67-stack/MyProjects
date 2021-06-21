public class Vector {
    private double[] a;

    public Vector(double[] b) {
        a = new double[b.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = b[i];
        }
    }

    public Vector plus(Vector that) {
        Vector c = new Vector(a);
        for (int i = 0; i < a.length; i++) {
            c.a[i] += that.a[i];
        }
        return c;
    }

    public Vector minus(Vector that) {
        Vector c = new Vector(a);
        for (int i = 0; i < a.length; i++) {
            c.a[i] -= that.a[i];
        }
        return c;
    }

    public Vector scale(double alpha) {
        Vector c = new Vector(a);
        for (int i = 0; i < a.length; i++) {
            c.a[i] *= alpha;
        }
        return c;
    }

    public double dot(Vector b) {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] * b.a[i]);
        }
        return sum;
    }

    public double magnitude() {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] * a[i]);
        }
        sum = Math.sqrt(sum);
        return sum;
    }

    public Vector direction() {
        Vector c = new Vector(a);
        double mag = magnitude();
        for (int i = 0; i < a.length; i++) {
            c.a[i] /= mag;
        }
        return c;
    }

    public double cartesian(int i) {
        return direction().a[i];
    }

    public String toString() {
        String s = "(";
        for (int i = 0; i < a.length; i++) {
            if (i != a.length - 1)
                s += (a[i] + ", ");
            else
                s += (a[i] + ")");
        }
        return s;
    }

    public static void main(String args[]) {
        double[] a = new double[10];
        double[] b = new double[10];
        double[] c = new double[10];
        double[] d = new double[10];
        for (int i = 0; i < 10; i++) {
            int r = StdRandom.uniform(i, 10);
            a[i] = i;
            b[i] = 9 - i;
            c[i] = i * i;
            d[i] = r;
        }
        Vector vector = new Vector(a);
        Vector vector1 = new Vector(b);
        Vector vector2 = new Vector(c);
        Vector vector3 = new Vector(d);

        StdOut.println(
                vector.toString() + " + " + vector1.toString() + " = " + vector.plus(vector1)
                                                                               .toString());

        StdOut.println(
                vector1.toString() + " - " + vector2.toString() + " = " + vector1.minus(vector2)
                                                                                 .toString());
        StdOut.println(4.8 + " * " + vector2.toString() + " = " + vector2.scale(4.8));

        StdOut.println(
                vector.toString() + " . " + vector3.toString() + " = " + vector.dot(vector3));


    }
}
