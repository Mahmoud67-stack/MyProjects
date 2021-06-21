public class Sicherman {
    public static void main(String[] args) {
        int[] dice1 = { 1, 3, 4, 5, 6, 8 };
        int[] dice2 = { 1, 2, 2, 3, 3, 4 };

        double[] sum = new double[13];

        for (int i = 0; i < 100; i++) {
            int sum1 = 0;
            int r = StdRandom.uniform(6);
            sum1 += dice1[r];
            r = StdRandom.uniform(6);
            sum1 += dice2[r];
            sum[sum1]++;
        }
        double[] normalized = new double[13];
        for (int i = 0; i < 13; i++)
            normalized[i] = (sum[i] / 100);

        StdStats.plotBars(normalized);
        StdStats.plotLines(normalized);
    }
}
