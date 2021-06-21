public class Histogram {
    private double[] arr;

    public Histogram(int n) {
        arr = new double[n];
    }

    public void addDataPoint(int i) {
        arr[i]++;
    }

    public void draw() {
        StdDraw.setYscale(0, 10);
        StdDraw.setXscale(0, 10);
        StdStats.plotBars(arr);
        StdStats.plotLines(arr);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        Histogram histo = new Histogram(n);
        for (int i = 0; i < n; i++) {
            histo.addDataPoint((int) (Math.random() * n));
        }
        histo.draw();
    }
}
