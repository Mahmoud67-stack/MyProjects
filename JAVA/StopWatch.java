public class StopWatch {
    private final long start;

    public StopWatch() {
        start = System.currentTimeMillis();
    }

    public double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StopWatch s1 = new StopWatch();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.sqrt(i);
        }
        double time = s1.elapsedTime();
        StdOut.println("The time elapsed is: " + (time));
    }
}
