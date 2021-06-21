public class RandomWalkers {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        boolean[][] istouched = new boolean[n][n];
        int[] x = new int[n];
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = n / 2;
            y[i] = n / 2;
        }
        int count = 0;
        boolean alltrue = false;
        istouched[n / 2][n / 2] = true;
        while (true) {
            count++;
            for (int i = 0; i < n; i++) {
                double rand = Math.random();
                if (rand <= 0.25) {
                    x[i]++;
                }
                else if (rand <= 0.5) {
                    x[i]--;
                }
                else if (rand <= 0.75) {
                    y[i]--;
                }
                else if (rand <= 1.0) {
                    y[i]++;
                }
                if (x[i] >= 0 && x[i] < n && y[i] < n && y[i] >= 0 && !istouched[x[i]][y[i]])
                    istouched[x[i]][y[i]] = true;
            }
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (!istouched[i][j]) {
                        alltrue = false;
                        break;
                    }
                    else
                        alltrue = true;
                }
                if (!alltrue)
                    break;
            }
            if (alltrue)
                break;
        }
        System.out
                .println(count + " steps is required for " + n + " walkers to pass by each cell");
    }
}
