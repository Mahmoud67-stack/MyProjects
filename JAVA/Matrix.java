public class Matrix {
    public static double dot(double[] a, double[] b) {
        if (a.length != b.length)
            throw new UnsupportedOperationException();
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += (a[i] * b[i]);
        }
        return sum;
    }

    public static double[][] multiply(double[][] a, double[][] b) {
        if (a[0].length != b.length)
            throw new UnsupportedOperationException();
        double[][] c = new double[a.length][b[0].length];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }

            }
        }
        return c;
    }

    public static double[][] transpose(double[][] a) {
        double[][] b = new double[a[0].length][a.length];
        for (int i = 0; i < a[0].length; i++)
            for (int j = 0; j < a.length; j++) {
                b[i][j] = a[j][i];
            }
        return b;
    }

    public static double[] multiply(double[][] a, double[] x) {
        if (a[0].length != x.length)
            throw new UnsupportedOperationException();
        double[] b = new double[a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < x.length; j++) {
                b[i] += a[i][j] * x[j];
            }
        return b;
    }

    public static double[] multiply(double[] x, double[][] a) {
        if (x.length != a.length)
            throw new UnsupportedOperationException();
        double[] b = new double[x.length];
        for (int i = 0; i < a[0].length; i++) {
            for (int j = 0; j < x.length; j++)
                b[i] += x[j] * a[j][i];
        }
        return b;
    }
}
