public class Bernoulli {
    public static int binomial(int n, double p) {
        int heads = 0;
        for (int i = 0; i < n; i++)
            if (StdRandom.bernoulli(p))
                heads++;
        return heads;
    }

    public static int binomial(int n) {
        int heads = 0;
        for (int i = 0; i < n; i++)
            if (StdRandom.bernoulli(0.5))
                heads++;
        return heads;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        int[] freq = new int[n + 1];

        for (int i = 0; i < trials; i++)
            freq[binomial(n)]++;

        double[] normalize = new double[n + 1];
        for (int i = 0; i < n; i++) {
            normalize[i] = 1.0 * freq[i] / trials;
            StdOut.println((i + 1) + ": " + normalize[i]);
        }
        StdStats.plotBars(normalize);

        double mean = n / 2.0;
        double stddev = Math.sqrt(n) / 2.0;
        double[] phi = new double[n + 1];
        for (int i = 0; i <= n; i++)
            phi[i] = GaussianPDF.pdf(i, mean, stddev);
        StdStats.plotLines(phi);
    }
}
